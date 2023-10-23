package Character;

import Item.WeaponFactory;

public class MageFactory extends CharacterFactory{
    @Override
    public Hero buildCharacter() {
        Hero mage = new Hero("Barbius", 15, 20, 10, 14, 12, 40,20,
                "Neutre Bon", "Mage");
        weapon = WeaponFactory.makeFireball();
        return mage;
    }
}
