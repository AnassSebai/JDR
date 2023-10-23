package Character;

import Combat.AttackType;
import Item.Weapon;
import Item.WeaponFactory;

public class ThugFactory extends CharacterFactory{
    @Override
    public Enemy buildCharacter() {
        Enemy thug = new Enemy(15, 11, 10, 10, 14, "Stronda", 64, 100);
        weapon = WeaponFactory.makeLongsword();
        return thug;
    }
}
