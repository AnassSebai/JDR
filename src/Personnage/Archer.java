package Personnage;
//3eme personnage
public class Archer extends Personnage {
    private static final int PM_INITIAL = 5;

    public Archer() {
        this.setNom("Lyra");
        this.setClasse("Archer");
        this.setDescription("Lyra est une éclaireuse habile, connue pour sa précision légendaire...");
        this.setNiveau(1);
        this.setPointsDeVie(50);
        this.setPointsDeMagie(PM_INITIAL);
        this.setForce(15);
        this.setAgilite(20);
        this.setIntelligence(10);
        this.setCharisme(14);
        this.setAlignement("Neutre bon");
       
    }

   
}
