package Item;

import Combat.AttackType;

public class WeaponFactory {
    public static Weapon makeShank(){
        return new Weapon(7, "Shank", "A prison shank", AttackType.PHYSICAL);
    }
    public static Weapon makeLeafScepter(){
        return new Weapon(12, "Leaf Scepter", "A magical forest scepter", AttackType.MAGICAL);
    }
    public static Weapon makeTusk(){
        return new Weapon(8, "Tusk", "A boar tusk", AttackType.PHYSICAL);
    }

    public static Weapon makeLongsword(){
        return new Weapon(11, "Longsword", "A long sword", AttackType.PHYSICAL);
    }

    public static Weapon makeFireball(){
        return new Weapon(12, "Fireball", "A ball of fire", AttackType.MAGICAL);
    }
    public static Weapon makeFang(){
        return new Weapon(12, "Fang", "A beast's fang", AttackType.PHYSICAL);
    }
    public static Weapon makeGreatsword(){
        return new Weapon(10, "Greataxe", "A really great axe", AttackType.PHYSICAL);
    }
}
