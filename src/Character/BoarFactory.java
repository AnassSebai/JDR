package Character;
import Item.WeaponFactory;

public class BoarFactory extends CharacterFactory {
    @Override
    public Enemy buildCharacter() {
        Enemy boar = new Enemy(13, 11, 2, 9, 12, "Sanglier", 22, 45);
        weapon = WeaponFactory.makeTusk();
        return boar;
    }
}
