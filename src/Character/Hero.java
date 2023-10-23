package Character;

public class Hero extends CharacterObject {
    public Hero(String name, int str, int dex, int intel, int wis, int con, int hp, int mana, String alignment, String playerClass) {
        Attributes attributes = new Attributes(0, 0, hp, mana,
                str, dex, intel, wis, con);
        this.setName(name);
        this.setAttributes(attributes);
        this.alignment = alignment;
        this.playerClass = playerClass;
    }

    private String alignment;
    private String playerClass;
    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }


    @Override
    public void getCharacterDescription() {
        Attributes atb = getAttributes();
        System.out.println("Nom : " + getName());
        System.out.println("Classe : " + getPlayerClass());
        System.out.println("Niveau : " + atb.getLevel());
        System.out.println("Points de Vie (PV) : " + atb.getHealthPoints());
        System.out.println("Points de Magie (PM) : " + atb.getMana());
        System.out.println("Force : " + atb.getForce());
        System.out.println("Agilité : " + atb.getAgility());
        System.out.println("Intelligence : " + atb.getIntelligence());
        System.out.println("Charisme : " + atb.getWisdom());
        System.out.println("Alignement : " + getAlignment());
    }
}
