package api.character.abilities.generate;

import java.util.ArrayList;
import java.util.List;

public abstract class AbilityGenerator {
    protected abstract List<Integer> get_oneScore();
    private List<Integer> generatedScores;

    public AbilityGenerator () {
        getAbilityScoreList();
    }

    public List<Integer> getGeneratedScores() {
        return generatedScores;
    }

    private void getAbilityScoreList() {
        List<Integer> scores = new ArrayList<Integer>();
        //someUpList
        for (int index = 0; index < 6; index++) {
            scores.add(index, get_oneScore().stream().mapToInt(i -> i.intValue()).sum());
        }
        this.generatedScores = scores;
    }

    public boolean isNumberInList(int number){
        if (generatedScores.stream().anyMatch(i -> number == i)){
            return true;
        }
        return false;
    }

    public boolean remove(int value) {
        Integer remove = null;
        for (Integer i : generatedScores) {
            if(i == value) {
                remove = i;
            }
        }
        if(remove != null) {
            generatedScores.remove(remove);
            return true;
        }
        return false;
    }
}