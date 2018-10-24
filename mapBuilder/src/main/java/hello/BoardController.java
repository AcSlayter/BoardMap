package hello;

import hello.something.Board;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by aaron on 9/29/2018.
 */

@Controller
public class BoardController {

    @GetMapping("/test")
    @ResponseBody
    public Board gretting() {
        return new Board();
//        return "test";
    }
    @GetMapping("/test/{x}/{y}")
    @ResponseBody
    public Board grettings(@PathVariable int x,@PathVariable int y ) {
        return new Board();
//        return "test";
    }
}
