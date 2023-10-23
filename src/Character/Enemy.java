package Character;


public class Enemy extends CharacterObject {
    public Enemy(int str, int dex, int intel, int wis, int con, String nom, int hp, int experience) {
        this.setName(nom);
        Attributes attributes = new Attributes(experience, 0, hp, 0,
                str, dex, intel, wis, con);
        setAttributes(attributes);
    }

    @Override
    public void getCharacterDescription() {

    }
}
