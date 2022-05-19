package springmvcproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Beksultan
 */
@Controller
public class GreetingsController {

    @RequestMapping("/welcome")
    public String greetings() {
        return "greetings";
    }
}
