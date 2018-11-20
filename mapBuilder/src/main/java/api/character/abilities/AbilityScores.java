package api.character.abilities;

public class AbilityScores {

    private Ability dexterity;
    private Ability strength;
    private Ability constitution;
    private Ability intelligence;
    private Ability wisdom;
    private Ability charisma;

    public AbilityScores () {
        this.strength = new Ability(AbilitieType.Strength);
        this.dexterity = new Ability(AbilitieType.Dexterity);
        this.constitution = new Ability(AbilitieType.Constitution);
        this.intelligence = new Ability(AbilitieType.Intelligence);
        this.wisdom = new Ability(AbilitieType.Wisdom);
        this.charisma = new Ability(AbilitieType.Charisma);
    }

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

