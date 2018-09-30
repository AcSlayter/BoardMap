package hello.example;

import hello.example.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
//
//    @RequestMapping("/")
//    @ResponseBody
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

    @GetMapping("/hello")
    @ResponseBody
    public Greeting gretting(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(name);
//        return "test";
    }

}