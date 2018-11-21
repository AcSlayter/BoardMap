package api.character.creator;

import api.character.Character;
import api.character.ErrorMessage;
import api.character.abilities.AbilitieType;
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
    public Object getCharacter(@PathVariable UUID UUID) {
        Character character = characterList.get(UUID);
        if(character != null) {
            return character;
        }
        return null;
    }

    @GetMapping("/Character/{UUID}/AbilitySet/{generateMethod}")
    @ResponseBody
    public Object getGeneration(@PathVariable UUID UUID,
                                @PathVariable String generateMethod) {
        Character character = characterList.get(UUID);
        if(character != null) {
            if (character.getAbilityGenerator().getGeneratedScores() == null) {
                character.setAbilityGenerationScore(generateMethod);
                return character.getAbilityGenerator();
            }else {
                return new ErrorMessage(false , "Character : ".concat(UUID.toString()).concat(" has Already Generated Abilities"));
            }
        } else {
            return new ErrorMessage(false , "Character : ".concat(UUID.toString()).concat(" not found"));
        }

    }

    @GetMapping("/Character/{UUID}/setAbilityValue/{abilityType}/{value}")
    @ResponseBody
    public Object setCharacterAbility(@PathVariable UUID UUID,
                                      @PathVariable String abilityType,
                                      @PathVariable int value) {
        Character character = characterList.get(UUID);
        if(character != null) {
            return  character.setAbilityScore(abilityType, value);
        }

        return null;
    }
}