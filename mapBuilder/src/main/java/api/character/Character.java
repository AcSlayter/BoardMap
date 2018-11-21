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

    public void setAbilityScore(String abilityTypeName, int value) {
        AbilitieType abilitieType = AbilitieType.valueOf(abilityTypeName);
        this.abilityScores.set(abilitieType, value);
    }
}
