package part5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class WelcomeController {

    @RequestMapping(value = "/", method =  RequestMethod.GET)
    public String welcome(Model model){
        model.addAttribute("message", "Helllo Sprng MVC Framework");
        return "welcome-page";
    }

//    @RequestMapping(value = "/profile", method = RequestMethod.GET)
//    public String profile(Model model){
//
//        return "abc";
//    }

}