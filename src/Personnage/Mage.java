package Personnage;
//4eme personnage 
public class Mage extends Personnage {
    private static final int PM_INITIAL = 20;

    public Mage() {
        this.setNom("Arion");
        this.setClasse("Mage");
        this.setDescription("Arion est un mage puissant et mystérieux...");
        this.setNiveau(1);
        this.setPointsDeVie(60);
        this.setPointsDeMagie(PM_INITIAL);
        this.setForce(12);
        this.setAgilite(16);
        this.setIntelligence(18);
        this.setCharisme(14);
        this.setAlignement("Neutre bon");
        
    }

   
}