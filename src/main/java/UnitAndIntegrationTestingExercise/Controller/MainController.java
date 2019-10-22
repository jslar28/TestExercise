package UnitAndIntegrationTestingExercise.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    public static int totalAmount = 0;

    @RequestMapping(value = {"", "/", "/index"}, method = RequestMethod.GET)
    public String index() {
        return "index.html";
    }



    @GetMapping("/internet-connection")
    @ResponseBody
    public boolean internetConnection(boolean internetConnection) {
        if (internetConnection) {
            return true;
        }
        else return false;
    }
}
