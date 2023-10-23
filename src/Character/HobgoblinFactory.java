package Character;

import Combat.AttackType;
import Item.Weapon;
import Item.WeaponFactory;

public class HobgoblinFactory extends CharacterFactory {
    @Override
    public Enemy buildCharacter() {
        Enemy hobgoblin = new Enemy(13, 12, 10, 10, 12, "Matias", 22, 100);
        weapon = WeaponFactory.makeLongsword();
        return hobgoblin;
    }
}
