package Personnage;
import java.util.List;
public abstract class Personnage {
    private String nom;
    private String classe;
    private String description;
    private int niveau;
    private int pointsDeVie;
    private int pointsDeMagie;
    private int force;
    private int agilite;
    private int intelligence;
    private int charisme;
    private String alignement;
    private List<String> inventaire;

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setClasse(String classe) {
        this.classe = classe;
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
    
    public void setAlignement(String alignement) {
        this.alignement = alignement;
    }
    
    public void setInventaire(List<String> inventaire) {
        this.inventaire = inventaire;
    }
    

    public int getNiveau ()
    {
        return niveau;
    }

    public int getPointsDeVie()
    {
        return pointsDeVie;
    }

    public int getPointsDeMagie()
    {
        return pointsDeMagie;
    }

    public String getNom() {
        return this.nom;
    }

    public String getClasse() {
        return this.classe;
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

    public String getAlignement() {
        return this.alignement;
    }

    public List<String> getInventaire() {
        return this.inventaire;
    }

    public void getDescriptionPersonnage() {
        System.out.println("Nom : " + getNom());
        System.out.println("Classe : " + getClasse());
        System.out.println("Description : " + getDescription());
        System.out.println("Niveau : " + getNiveau());
        System.out.println("Points de Vie (PV) : " + getPointsDeVie());
        System.out.println("Points de Magie (PM) : " + getPointsDeMagie());
        System.out.println("Force : " + getForce());
        System.out.println("Agilité : " + getAgilite());
        System.out.println("Intelligence : " + getIntelligence());
        System.out.println("Charisme : " + getCharisme());
        System.out.println("Alignement : " + getAlignement());
        System.out.println("Inventaire : " + getInventaire());
    }
}





