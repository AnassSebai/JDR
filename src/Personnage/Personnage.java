package Personnage;

import java.util.Random;

public abstract class Personnage {
    private String nom;
    private String description;
    private int experience;
    private int niveau;
    private int pointsDeVie;
    private int pointsDeMagie;
    private int force;
    private int agilite;
    private int intelligence;
    private int charisme;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setPointsDeMagie(int pointsDeMagie) {
        this.pointsDeMagie = pointsDeMagie;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setCharisme(int charisme) {
        this.charisme = charisme;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    public int getNiveau() {
        return niveau;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getPointsDeMagie() {
        return pointsDeMagie;
    }

    public String getNom() {
        return this.nom;
    }

    public String getDescription() {
        return this.description;
    }


    public int getForce() {
        return this.force;
    }

    public int getAgilite() {
        return this.agilite;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public int getCharisme() {
        return this.charisme;
    }

    public int getExperience() {
        return experience;
    }

    // Méthode pour attaquer
    public int attack() { // TODO Solve how we'll calculate damage
        Random rand = new Random();
        //int degatsInfliges = rand.nextInt(pointsDAttaque) + 1;
        return 0;
    }

    // Méthode pour subir des dégâts
    public void takeDamage(int degats) {
        setPointsDeVie(getPointsDeVie() - degats);
        if (getPointsDeVie() < 0) {
            setPointsDeVie(0);
        }
    }

    // Méthode pour vérifier si l'ennemi est en vie
    public boolean isAlive() {
        return getPointsDeVie() > 0;
    }

    public abstract void getDescriptionPersonnage();
}





