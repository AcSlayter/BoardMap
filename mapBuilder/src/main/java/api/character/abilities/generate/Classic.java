package api.character.abilities.generate;

import api.character.Dice;

import java.util.Collections;
import java.util.List;

public class Classic extends AbilityGenerator {

    public List<Integer> get_oneScore(){
        List<Integer> roll = Dice.roll(3, 6);
        Collections.sort(roll);
        return roll;
    }
}
