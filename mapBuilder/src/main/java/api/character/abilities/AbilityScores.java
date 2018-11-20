package api.character.abilities;

public class AbilityScores {

    private Ability dexterity;
    private Ability strength;
    private Ability constitution;
    private Ability intelligence;
    private Ability wisdom;
    private Ability charisma;

    public AbilityScores () {}

    public Ability getStrength() {
        return strength;
    }

    public Ability getDexterity() {
        return dexterity;
    }

    public Ability getConstitution() {
        return constitution;
    }

    public Ability getIntelligence() {
        return intelligence;
    }

    public Ability getWisdom() {
        return wisdom;
    }

    public Ability getCharisma() {
        return charisma;
    }

    public void setDexterity(int score) {
            this.dexterity = new Ability(AbilitieType.Dexterity);
    }

    public void setStrength(int score) {
        this.strength = new Ability(AbilitieType.Strength);
    }

    public void setConstitution(int score) {
        this.constitution = new Ability(AbilitieType.Constitution);
    }

    public void setIntelligence(int score) {
        this.intelligence = new Ability(AbilitieType.Intelligence);
    }

    public void setWisdom(int score) {
        this.wisdom = new Ability(AbilitieType.Wisdom);
    }

    public void setCharisma(int score) {
        this.charisma = new Ability(AbilitieType.Charisma);
    }

    protected class Ability {

        private AbilitieType abilitieType;

        private int AbilityScore = 0;

        Ability(AbilitieType abilitieType) {
            this.abilitieType = abilitieType;
        }

        public AbilitieType getAbilitieType() {
            return abilitieType;
        }

        public int getAbilityScore() {
            return AbilityScore;
        }
    }

}

