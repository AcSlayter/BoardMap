package api.character;

import api.character.RaceType.RaceType;
import api.character.abilities.generate.AbilityGenerator;
import api.character.abilities.AbilityScores;
import api.character.abilities.generate.Heroic;
import api.character.classes.ClassType;

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
}
