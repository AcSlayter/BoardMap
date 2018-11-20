package api.character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {
    public static List<Integer> roll(int number_of_dice, int sides_of_dice) {
        List<Integer> result =  new ArrayList<Integer>();
        Random random = new Random();

        for(int index = 0; index < number_of_dice ; index++){
            result.add(index,1 + (random.nextInt(sides_of_dice)));
        }
        return result;
    }
}
