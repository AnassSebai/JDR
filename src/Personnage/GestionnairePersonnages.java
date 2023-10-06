package Personnage;

import Combat.AttackType;
import Item.Weapon;
import Personnage.Enemy.Enemy;
import Personnage.Hero.*;

//Gestionnaire des personnage
public class GestionnairePersonnages {
    public static Hero creerMage() {
        Hero mage = new Hero();
        mage.setNom("Arion");
        mage.setClasse("Mage");
        mage.setDescription("Arion est un mage puissant et mystérieux...");
        mage.setNiveau(1);
        mage.setPointsDeVie(60);
        mage.setPointsDeMagie(20);
        mage.setForce(12);
        mage.setAgilite(16);
        mage.setIntelligence(18);
        mage.setWisdom(14);
        mage.setAlignement("Neutre bon");
        return mage;
    }

    public static Hero creerArcher() {
        Hero archer = new Hero();
        archer.setNom("Lyra");
        archer.setClasse("Archer");
        archer.setDescription("Lyra est une éclaireuse habile, connue pour sa précision légendaire...");
        archer.setNiveau(1);
        archer.setPointsDeVie(50);
        archer.setPointsDeMagie(5);
        archer.setForce(15);
        archer.setAgilite(20);
        archer.setIntelligence(10);
        archer.setWisdom(14);
        archer.setAlignement("Neutre bon");
        return archer;
    }

    public static Hero creerGuerrier() {
        Hero guerrier = new Hero();
        guerrier.setNom("Cedric");
        guerrier.setClasse("Guerrier");
        guerrier.setDescription("Sir Cedric est un guerrier courageux, vêtu d'une armure lourde étincelante...");
        guerrier.setNiveau(2);
        guerrier.setPointsDeVie(90);
        guerrier.setPointsDeMagie(5);
        guerrier.setForce(22);
        guerrier.setAgilite(15);
        guerrier.setIntelligence(10);
        guerrier.setWisdom(18);
        guerrier.setAlignement("Bon");
        return guerrier;
    }

    public static Hero creerBarbare() {
        Hero barbare = new Hero();
        barbare.setNom("Grondar");
        barbare.setClasse("Barbare");
        barbare.setDescription("Grondar est un colosse imposant, doté de muscles puissants et d'une stature impressionnante...");
        barbare.setNiveau(1);
        barbare.setPointsDeVie(100);
        barbare.setPointsDeMagie(5);
        barbare.setForce(25);
        barbare.setAgilite(8);
        barbare.setIntelligence(6);
        barbare.setWisdom(10);
        barbare.setAlignement("Neutre");
        return barbare;
    }

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
