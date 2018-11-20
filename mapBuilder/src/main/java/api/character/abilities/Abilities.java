package api.character.abilities;

public enum Abilities {
    Strength("str"), Dexterity("dex"), Constitution("con"), Intelligence("int"), Wisdom("wis"), Charisma("cha");

    Abilities(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    private String abbreviation;

    public String getAbbreviation(){
        return abbreviation;
    }
}