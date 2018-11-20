package api.character.abilities.generate;

import java.util.ArrayList;
import java.util.List;

public abstract class AbilityGenerator {

    public abstract List<Integer> get_oneScore();

    public String getAbilityScoreList() {
        List<Integer> scores = new ArrayList<Integer>();
        //someUpList
        for (int index = 0; index < 6; index++) {
            scores.add(index, get_oneScore().stream().mapToInt(i -> i.intValue()).sum());
        }

        return scores.toString();
    }


}
