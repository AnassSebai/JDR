package Character;

import Combat.AttackType;
import Item.Weapon;
import Item.WeaponFactory;

public class WorgFactory extends  CharacterFactory{

    @Override
    public Enemy buildCharacter() {
        Enemy worg = new Enemy(16, 13, 7, 11, 13, "Bud", 52, 100);
        weapon = WeaponFactory.makeFang();
        return worg;
    }
}
