package Personnage;
//Gestionnaire des personnage
public class GestionnairePersonnages {
    public static Personnage creerMage() {
        Mage mage = new Mage();
        // Définir les autres propriétés du Mage si nécessaire
        return mage;
    }
    
    public static Personnage creerArcher() {
        Archer archer = new Archer();
        // Définir les autres propriétés de l'Archer si nécessaire
        return archer;
    }
    
    public static Personnage creerGuerrier() {

        Guerrier guerrier = new Guerrier();
        
        return guerrier;
    }
    
    public static Personnage creerBarbare() {
        Barbare barbare = new Barbare();
        // Définir les autres propriétés du Barbare si nécessaire
        return barbare;
    }
    
}
