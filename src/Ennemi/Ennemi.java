package Ennemi;

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

public class Ennemi {
    private String nom;
    private int pointsDeVie;
    private int pointsDAttaque;
    private int experience;

    // Constructeur
    public Ennemi(String nom, int pointsDeVie, int pointsDAttaque, int experience) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.pointsDAttaque = pointsDAttaque;
        this.experience = experience;
    }

    // Méthode pour attaquer
    public int attaque() {
        Random rand = new Random();
        int degatsInfliges = rand.nextInt(pointsDAttaque) + 1;
        return degatsInfliges;
    }

    // Méthode pour subir des dégâts
    public void subirDegats(int degats) {
        pointsDeVie -= degats;
        if (pointsDeVie < 0) {
            pointsDeVie = 0;
        }
    }

    // Méthode pour vérifier si l'ennemi est en vie
    public boolean estEnVie() {
        return pointsDeVie > 0;
    }

    // Getter pour l'expérience que l'ennemi rapporte
    public int getExperience() {
        return experience;
    }

    // Getter pour le nom de l'ennemi
    public String getNom() {
        return nom;
    }
}
