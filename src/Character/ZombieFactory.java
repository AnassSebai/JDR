package Character;

import Combat.AttackType;
import Item.Weapon;
import Item.WeaponFactory;

public class ZombieFactory extends CharacterFactory{

    @Override
    public Enemy buildCharacter() {
        Enemy zombie = new Enemy(13, 6, 3, 6, 16, "Frankie", 44, 100);
        weapon = WeaponFactory.makeShank();
        return zombie;
    }
}
