package Ennemi;

import java.util.Random;

/*
 * Pour cette classe il manque de faire des ennemis différents avec des caractéristiques différentes
 * et de faire le héritage par cette derniere soit de Personnage ou d'une nouvelle classe Creature
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
