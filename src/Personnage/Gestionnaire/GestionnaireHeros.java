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
}
