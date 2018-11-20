package api.character;

import api.character.creator.CharacterCreatorControler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CharacterController {
//    @GetMapping("/test/{x}/{y}")
//    @ResponseBody
//    public Board grettings(@PathVariable int x, @PathVariable int y ) {


    @GetMapping("/char")
    @ResponseBody
    public String grettings() {
        CharacterCreatorControler characterCreator = new CharacterCreatorControler();
        return new Character().toString();
    }
}
