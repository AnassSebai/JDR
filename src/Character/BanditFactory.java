package Character;
import Item.WeaponFactory;

public class BanditFactory extends CharacterFactory{
    @Override
    public Enemy buildCharacter() {
        Enemy bandit = new Enemy(11, 15, 12, 10, 10, "Zorro", 22, 25);
        weapon = WeaponFactory.makeShank();
        return bandit;
    }
}
