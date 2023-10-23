package Character;

import Combat.AttackType;
import Item.Weapon;
import Item.WeaponFactory;

public class ImpFactory extends CharacterFactory {
    @Override
    public Enemy buildCharacter() {
        Enemy imp = new Enemy(10, 13, 14, 15, 11, "Saci", 44, 100);
        weapon = WeaponFactory.makeFireball();
        return imp;
    }
}
