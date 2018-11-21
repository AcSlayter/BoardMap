package api.character.abilities.generate;

import api.character.Dice;

import java.util.Collections;
import java.util.List;

public class Standard extends AbilityGenerator {



    //get 4d6 rolls and removed the smallest number and add the results together
    protected List<Integer> get_oneScore(){
        List<Integer> roll = Dice.roll(4, 6);
        Collections.sort(roll);
        roll.remove(0);
        return roll;
    }
}
