package Personnage;

import Item.Weapon;
import Personnage.Personnage;

public class Hero extends Personnage {
    private String alignement;
    private String classe;
    public String getAlignement() {
        return alignement;
    }

    public void setAlignement(String alignement) {
        this.alignement = alignement;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }


    @Override
    public void getDescriptionPersonnage() {
        System.out.println("Nom : " + getNom());
        System.out.println("Classe : " + getClasse());
        System.out.println("Niveau : " + getNiveau());
        System.out.println("Points de Vie (PV) : " + getPointsDeVie());
        System.out.println("Points de Magie (PM) : " + getPointsDeMagie());
        System.out.println("Force : " + getForce());
        System.out.println("Agilité : " + getAgilite());
        System.out.println("Intelligence : " + getIntelligence());
        System.out.println("Charisme : " + getWisdom());
        System.out.println("Alignement : " + getAlignement());
    }
}
