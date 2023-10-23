package Character;

import Item.WeaponFactory;

public class DryadFactory extends  CharacterFactory {
    @Override
    public Enemy buildCharacter() {
        Enemy dryad = new Enemy(10, 13, 14, 15, 11, "Saci", 44, 100);
        weapon = WeaponFactory.makeLeafScepter();
        return dryad;
    }
}
