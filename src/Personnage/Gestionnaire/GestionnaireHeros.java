package Personnage.Gestionnaire;

import Combat.AttackType;
import Item.Weapon;
import Personnage.Enemy.Enemy;
import Personnage.Hero.*;

//Gestionnaire des personnage
public class GestionnaireHeros {
    public static Hero creerMage() {
        Hero mage = new Hero();
        mage.setNom("Arion");
        mage.setClasse("Mage");
        mage.setNiveau(1);
        mage.setPointsDeVie(40);
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
        archer.setNiveau(1);
        archer.setPointsDeVie(45);
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
        guerrier.setNiveau(2);
        guerrier.setPointsDeVie(65);
        guerrier.setPointsDeMagie(5);
        guerrier.setForce(14);
        guerrier.setAgilite(13);
        guerrier.setIntelligence(10);
        guerrier.setWisdom(12);
        guerrier.setConstitution(15);
        guerrier.setAlignement("Bon");
        Weapon greataxe = new Weapon(10, "Greataxe", "A really great axe", AttackType.PHYSICAL);
        guerrier.setWeapon(greataxe);
        return guerrier;
    }

    public static Hero creerBarbare() {
        Hero barbare = new Hero();
        barbare.setNom("Grondar");
        barbare.setClasse("Barbare");
        barbare.setNiveau(1);
        barbare.setPointsDeVie(75);
        barbare.setPointsDeMagie(5);
        barbare.setForce(25);
        barbare.setAgilite(8);
        barbare.setIntelligence(6);
        barbare.setWisdom(10);
        barbare.setAlignement("Neutre");
        return barbare;
    }
}
