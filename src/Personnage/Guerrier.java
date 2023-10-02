package Personnage;
//2eme personnage 
public class Guerrier extends Personnage {
    private static final int PM_INITIAL = 5;

    public Guerrier() {
        this.setNom("Cedric");
        this.setClasse("Guerrier");
        this.setDescription("Sir Cedric est un guerrier courageux, vêtu d'une armure lourde étincelante...");
        this.setNiveau(2);
        this.setPointsDeVie(90);
        this.setPointsDeMagie(PM_INITIAL);
        this.setForce(22);
        this.setAgilite(15);
        this.setIntelligence(10);
        this.setCharisme(18);
        this.setAlignement("Bon");
        
    }

   
}
