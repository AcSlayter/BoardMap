package api.character.creator;

import api.character.Character;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
public class CharacterCreatorControler {
    Map<UUID, Character> characterList = new HashMap();
    
    @GetMapping("/createChar")
    @ResponseBody
    public Character createChar() {
        Character character = new Character();
        characterList.put(character.getkey(), character);
        return  character;
    }
}
