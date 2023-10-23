package Character;
import Item.WeaponFactory;

public class WarriorFactory extends CharacterFactory {
    @Override
    public Hero buildCharacter() {
        Hero guerrier = new Hero("Cedric", 14,13,10,12,15,65, 5,
                "Bon", "Guerrier");
        weapon = WeaponFactory.makeGreatsword();
        return guerrier;
    }
}
