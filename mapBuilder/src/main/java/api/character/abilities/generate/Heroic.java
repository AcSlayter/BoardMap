package api.character.abilities.generate;

import api.character.Dice;

import java.util.Collections;
import java.util.List;

public class Heroic extends AbilityGenerator {

    public List<Integer> get_oneScore(){
        List<Integer> roll = Dice.roll(2, 6);
        Collections.sort(roll);
        roll.add(6);
        return roll;
    }
}
