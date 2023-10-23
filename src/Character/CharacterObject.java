package Character;

import Item.*;

import java.util.List;

public abstract class CharacterObject {
    private String name;
    private Attributes attributes;
    private List<Item> inventory;
    private Weapon weapon;

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void takeDamage(int degats) {
        attributes.setHealthPoints(attributes.getHealthPoints() - degats);
        if (attributes.getHealthPoints() < 0) {
            attributes.setHealthPoints(0);
        }
    }

    public boolean isAlive() {
        return attributes.getHealthPoints() > 0;
    }

    public abstract void getCharacterDescription();
}





