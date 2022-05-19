package springmvcproject;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Beksultan
 */
@Component
@Getter
@Setter
public class StudentRepository {
    private List<Student> studentList;

    public StudentRepository() {
        studentList = new ArrayList<>(Arrays.asList(
                new Student("Chynara", "chynara@gmail.com"),
                new Student("Dilbara", "dilbara@gmail.com"),
                new Student("Muhammed", "muhammed@gmail.com")
        ));
    }

    public void setStudent(Student student) {
        this.studentList.add(student);
    }
}
