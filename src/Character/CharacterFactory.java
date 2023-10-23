package Character;

import Item.Weapon;

public abstract class CharacterFactory {
    Weapon weapon;
    public CharacterObject createCharacter(){
        CharacterObject character = buildCharacter();
        character.setWeapon(weapon);
        return character;
    }
    public abstract CharacterObject buildCharacter();
}
