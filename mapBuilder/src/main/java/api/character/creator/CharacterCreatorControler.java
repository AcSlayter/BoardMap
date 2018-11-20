package api.character.creator;

import api.character.Character;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/Character/{UUID}")
    @ResponseBody
    public Character grettings(@PathVariable UUID UUID) {
        Character character = characterList.get(UUID);
        if(character != null) {
            return character;
        }
        return null;
    }

    @GetMapping("/Character/{UUID}/AbilitySet/{generateMethod}")
    @ResponseBody
    public Character grettings(@PathVariable UUID UUID, @PathVariable String generateMethod) {
        Character character = characterList.get(UUID);
        if(character != null) {
            character.setAbilityScore(generateMethod);
            return character;
        }
        return null;
    }

}
