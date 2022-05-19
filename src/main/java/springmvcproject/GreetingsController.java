package springmvcproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Beksultan
 */
@Controller
public class GreetingsController {

    private final StudentRepository studentRepository;

    public GreetingsController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET) // localhost:8080/welcome
    public String greetings() {
        return "greetings";
    }

    @RequestMapping(value = "/kg",method = RequestMethod.GET)       // localhost:8080
    public String greetingsWithModel(Model model) {
        model.addAttribute("word", "Kyrgyzstan");
        return "greetings2";
    }
    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public String showStudents(Model model) {
        model.addAttribute("students", studentRepository.getStudentList());
        return "students";
    }

    @RequestMapping(value = "/student/save", method = RequestMethod.GET)
    public String showSaveStudentPage(Model model) {
        model.addAttribute("newStudent", new Student());
        return "save-student";
    }

    @RequestMapping(value = "/student/save", method = RequestMethod.POST)
    public String saveStudent(Student student, Model model) {
        studentRepository.setStudent(student);
        model.addAttribute("savedStudent", student);
        return "redirect:/result";
    }
    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String showResult() {
        System.out.println("there works2!");
        return "result";
    }

    @ExceptionHandler(Exception.class)
    public String handleAnException(Exception e) {
        e.printStackTrace();
        return "exception";
    }
}
