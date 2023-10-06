package Personnage.Enemy;

import Personnage.Personnage;

import java.util.Random;

/*
 * Pour cette classe il manque de faire des ennemis différents avec des caractéristiques différentes
 * et de faire le héritage par cette derniere soit de Personnage ou d'une nouvelle classe Creature
 * 
 */



/*
Une piste pour la création des ennemis:
 * On peut créer les ennemis suivants:
 * - Un gobelin: 10 points de vie, 3 points d'attaque, 1 point d'expérience
 * - Un troll: 20 points de vie, 5 points d'attaque, 2 points d'expérience
 * - Un dragon: 50 points de vie, 10 points d'attaque, 5 points d'expérience
 * - Un loup: 15 points de vie, 4 points d'attaque, 1 point d'expérience
 * - Un ours: 30 points de vie, 7 points d'attaque, 2 points d'expérience
 * - Un serpent: 5 points de vie, 2 points d'attaque, 1 point d'expérience
 * - Un squelette: 10 points de vie, 3 points d'attaque, 1 point d'expérience
 * - Un zombie: 15 points de vie, 4 points d'attaque, 2 points d'expérience
 * - Un fantôme: 5 points de vie, 2 points d'attaque, 1 point d'expérience
 * - Un vampire: 20 points de vie, 5 points d'attaque, 3 points d'expérience
 *  
 * On peut aussi créer des boss:
 * - Un boss gobelin: 20 points de vie, 6 points d'attaque, 2 points d'expérience
 * - Un boss troll: 40 points de vie, 10 points d'attaque, 4 points d'expérience
 * - Un boss dragon: 100 points de vie, 20 points d'attaque, 10 points d'expérience
 * 
 * 
 */

public class Enemy extends Personnage {


    public Enemy(int str, int dex, int intel, int wis, int con, String nom, int pointsDeVie, int experience) {
        this.setNom(nom);
        this.setPointsDeVie(pointsDeVie);
        this.setExperience(experience);
    }

    @Override
    public void getDescriptionPersonnage() {

    }
}
