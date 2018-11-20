package api.character;

import api.character.RaceType.RaceType;
import api.character.abilities.generate.AbilityGenerator;
import api.character.abilities.AbilityScores;
import api.character.abilities.generate.Heroic;
import api.character.classes.ClassType;

import java.util.UUID;

public class Character {

    private UUID key = UUID.randomUUID();
    ClassType classType;
    RaceType raseType;
    AbilityScores abilityScores;

    public Character(){
        getStandard();
    }

    public void getStandard(){

    }

    @Override
    public String toString() {
        AbilityGenerator abilityGenerator = new Heroic();

        return abilityGenerator.getAbilityScoreList();
    }

    public UUID getkey() {
        return this.key;
    }
}
