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

    public boolean set(AbilitieType abilityType, int value) {
        if(abilityType.equals(AbilitieType.Charisma) &&  this.charisma == null ) {
            this.charisma = new Ability(AbilitieType.Charisma, value);
            return true;
        }else if (abilityType.equals(AbilitieType.Wisdom) &&  this.wisdom == null){
            this.wisdom = new Ability(AbilitieType.Wisdom, value);
            return true;
        } else if (abilityType.equals(AbilitieType.Intelligence) &&  this.intelligence == null) {
            this.intelligence = new Ability(AbilitieType.Intelligence, value);
            return true;
        } else if (abilityType.equals(AbilitieType.Constitution)&&  this.constitution == null) {
            this.constitution = new Ability(AbilitieType.Constitution, value);
            return true;
        }else if (abilityType.equals(AbilitieType.Strength) &&  this.strength == null) {
            this.strength = new Ability(AbilitieType.Strength, value);
            return true;
        }else if (abilityType.equals(AbilitieType.Dexterity) &&  this.dexterity == null) {
            this.dexterity = new Ability(AbilitieType.Dexterity, value);
            return true;
        }
        return false;
    }

    protected class Ability {

        private AbilitieType abilitieType;
        private int abilityScore = 0;

        Ability(AbilitieType abilitieType, int value) {
            this.abilitieType = abilitieType;
            this.abilityScore = value;
        }

        public AbilitieType getAbilitieType() {
            return abilitieType;
        }

        public int getAbilityScore() {
            return abilityScore;
        }
    }

}

