package api.character;

import api.character.abilities.AbilityScores;

import java.util.UUID;

public class Character {

    private UUID key = UUID.randomUUID();
    AbilityScores abilityScores;

    public Character(){
        abilityScores = new AbilityScores();
    }

    public UUID getkey() {
        return this.key;
    }

    public AbilityScores getAbilityScores() {
        return abilityScores;
    }

    public String setAbilityScore(String generateMethod) {
        return generateMethod.concat(" : Unknown ");
    }
}
