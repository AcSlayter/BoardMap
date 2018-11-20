package api.character.abilities;

public enum AbilitieType {
    Strength("str"), Dexterity("dex"), Constitution("con"), Intelligence("int"), Wisdom("wis"), Charisma("cha");


    private String abbreviation;

    AbilitieType(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation(){
        return abbreviation;
    }


}