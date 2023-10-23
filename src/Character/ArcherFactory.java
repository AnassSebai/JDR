package Character;

import Item.WeaponFactory;

public class ArcherFactory extends CharacterFactory {
    @Override
    public Hero buildCharacter() {
        Hero archer = new Hero("Lyra", 15, 20, 10, 14, 12, 45,5,
                "Bon", "Archer");
        weapon = WeaponFactory.makeGreatsword();
        return archer;
    }
}
