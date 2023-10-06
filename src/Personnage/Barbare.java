package Personnage;
//1er personnage 
public class Barbare extends Human {
    private static final int PM_INITIAL = 5;
    //constructeur 
    public Barbare() {
        this.setNom("Grondar");
        this.setClasse("Barbare");
        this.setDescription("Grondar est un colosse imposant, doté de muscles puissants et d'une stature impressionnante...");
        this.setNiveau(1);
        this.setPointsDeVie(100);
        this.setPointsDeMagie(PM_INITIAL);
        this.setForce(25);
        this.setAgilite(8);
        this.setIntelligence(6);
        this.setCharisme(10);
        this.setAlignement("Neutre");
       
    }
  
}