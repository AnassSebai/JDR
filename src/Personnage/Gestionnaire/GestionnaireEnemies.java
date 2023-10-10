package Personnage.Gestionnaire;

import Combat.AttackType;
import Item.Weapon;
import Personnage.Enemy.Enemy;
import Personnage.Hero.Hero;

//Gestionnaire des personnage
public class GestionnaireEnemies {
    public static Enemy createBandit() {
        Enemy bandit = new Enemy(11, 12, 12, 10, 10, "Zorro", 11, 25);
        Weapon weapon = new Weapon(5, "Shank", "A prison shank", AttackType.PHYSICAL);
        bandit.setWeapon(weapon);
        return bandit;
    }

    public static Enemy createGoblin() {
        Enemy goblin = new Enemy(8, 14, 10, 8, 10, "Johnny", 7, 35);
        Weapon weapon = new Weapon(5, "Shank", "A prison shank", AttackType.PHYSICAL);
        goblin.setWeapon(weapon);
        return goblin;
    }

    public static Enemy createBoar() {
        Enemy boar = new Enemy(13, 11, 2, 9, 12, "Sanglier", 11, 45);
        Weapon weapon = new Weapon(6, "Tusk", "A boar tusk", AttackType.PHYSICAL);
        boar.setWeapon(weapon);
        return boar;
    }

    public static Enemy createWolf() {
        Enemy wolf = new Enemy(12, 15, 3, 12, 12, "Amadeu", 11, 55);
        Weapon weapon = new Weapon(6, "Tusk", "A boar tusk", AttackType.PHYSICAL);
        wolf.setWeapon(weapon);
        return wolf;
    }

    public static Enemy createSkeleton() {
        Enemy skeleton = new Enemy(10, 14, 6, 8, 15, "Boney", 13, 55);
        Weapon weapon = new Weapon(7, "Shortsword", "A short sword", AttackType.PHYSICAL);
        skeleton.setWeapon(weapon);
        return skeleton;
    }

    public static Enemy createZombie() {
        Enemy zombie = new Enemy(13, 6, 3, 6, 16, "Frankie", 22, 100);
        Weapon weapon = new Weapon(5, "Shank", "A prison shank", AttackType.PHYSICAL);
        zombie.setWeapon(weapon);
        return zombie;
    }

    public static Enemy createHobgoblin() {
        Enemy hobgoblin = new Enemy(13, 12, 10, 10, 12, "Matias", 11, 100);
        Weapon weapon = new Weapon(9, "Longsword", "A long sword", AttackType.PHYSICAL);
        hobgoblin.setWeapon(weapon);
        return hobgoblin;
    }

    public static Enemy createThug() {
        Enemy thug = new Enemy(15, 11, 10, 10, 14, "Stronda", 32, 100);
        Weapon weapon = new Weapon(9, "Longsword", "A long sword", AttackType.PHYSICAL);
        thug.setWeapon(weapon);
        return thug;
    }

    public static Enemy createWorg() {
        Enemy worg = new Enemy(16, 13, 7, 11, 13, "Bud", 26, 100);
        Weapon weapon = new Weapon(8, "Fang", "A beast's fang", AttackType.PHYSICAL);
        worg.setWeapon(weapon);
        return worg;
    }

    public static Enemy createDryad() {
        Enemy dryad = new Enemy(10, 13, 14, 15, 11, "Saci", 22, 100);
        Weapon weapon = new Weapon(8, "Leaf Scepter", "A magical forest scepter", AttackType.MAGICAL);
        dryad.setWeapon(weapon);
        return dryad;
    }

    public static Enemy createImp() {
        Enemy dryad = new Enemy(10, 13, 14, 15, 11, "Saci", 22, 100);
        Weapon weapon = new Weapon(8, "Fireball", "A ball of fire", AttackType.MAGICAL);
        dryad.setWeapon(weapon);
        return dryad;
    }
}
