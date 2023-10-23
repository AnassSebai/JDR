package Character;

public class Attributes {
    private int experience;
    private int level;
    private int healthPoints;
    private int mana;
    private int force;
    private int agility;
    private int intelligence;
    private int wisdom;
    private int constitution;

    public Attributes(int experience, int level, int healthPoints, int mana, int force, int agility, int intelligence, int wisdom, int constitution) {
        this.experience = experience;
        this.level = level;
        this.healthPoints = healthPoints;
        this.mana = mana;
        this.force = force;
        this.agility = agility;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.constitution = constitution;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
}
