package Personnage;

import Item.*;

import java.util.List;
import java.util.Random;

public abstract class Personnage {
    private String nom;
    private int experience;
    private int niveau;
    private int pointsDeVie;
    private int pointsDeMagie;
    // on calcule le baseAttackDamage avec force et agilite
    private int force;
    private int agilite;
    private int intelligence;
    private int wisdom;
    private int constitution;
    private List<Item> inventory;
    private Weapon weapon;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setPointsDeVie(int pointsDeVie) {
        if(pointsDeVie<=0) {
            this.pointsDeVie = 0;
            return;
        }
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

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public List<Item> getInventory() {
        return (List<Item>) inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
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

    public int getForce() {
        return this.force;
    }

    public int getAgilite() {
        return this.agilite;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public int getWisdom() {
        return this.wisdom;
    }

    public int getExperience() {
        return experience;
    }

    public Weapon getWeapon() {
        return weapon;
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





