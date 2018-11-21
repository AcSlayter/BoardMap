package api.character;

import api.character.abilities.AbilitieType;
import api.character.abilities.AbilityScores;
import api.character.abilities.generate.*;

import java.lang.reflect.Constructor;
import java.util.UUID;

public class Character {

    private UUID key = UUID.randomUUID();
    AbilityScores abilityScores;
    AbilityGenerator abilityGenerator;

    public AbilityGenerator getAbilityGenerator() {
        return abilityGenerator;
    }

    public Character(){
        abilityScores = new AbilityScores();
    }

    public UUID getkey() {
        return this.key;
    }

    public AbilityScores getAbilityScores() {
        return abilityScores;
    }

    public Object setAbilityGenerationScore(String generateMethod) {
        try {
            String className = "api.character.abilities.generate.".concat(generateMethod);
            Class cl= Class.forName(className);
            Constructor constructor = cl.getConstructor();
            abilityGenerator = (AbilityGenerator) constructor.newInstance();
        } catch (Exception e) {
            return e.toString();
        }
        return null;
    }

    public Object setAbilityScore(String abilityTypeName, int value) {
        AbilitieType abilitieType;
        try {
            abilitieType = AbilitieType.valueOf(abilityTypeName);
        } catch (IllegalArgumentException e){
            return new ErrorMessage(false, abilityTypeName.concat(" Name not found") );
        }

        if (!abilityGenerator.isNumberInList(value)) {
            return new ErrorMessage(false, String.valueOf(value).concat(" is not Contained in : ").concat(abilityGenerator.getGeneratedScores().toString()));
        }

        if (this.abilityScores.set(abilitieType, value)){
            if(abilityGenerator.remove(value)) {
                return this.abilityScores;
            } else {
                return new ErrorMessage(false, "Not able to remove :".concat(String.valueOf(value).concat(" from :").concat(abilityGenerator.getGeneratedScores().toString())));
            }
        }

        return false;
    }
}
