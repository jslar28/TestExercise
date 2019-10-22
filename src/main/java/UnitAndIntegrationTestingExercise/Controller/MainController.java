package UnitAndIntegrationTestingExercise.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = {"", "/", "/index"}, method = RequestMethod.GET)
    public String index() {
        return "index.html";
    }

    @GetMapping("/lol")
    public String lol() {
        System.out.println("lol");
        return "index.html";
    }
}
