package Character;
import Item.WeaponFactory;

public class GoblinFactory extends CharacterFactory{
    @Override
    public Enemy buildCharacter() {
        Enemy goblin = new Enemy(8, 14, 10, 8, 10, "Johnny", 14, 35);
        weapon = WeaponFactory.makeShank();
        return goblin;
    }
}
