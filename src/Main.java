import Personnage.GestionnairePersonnages;
import Personnage.Hero.Hero;

public class Main {
    public static void main(String[] args) {
        GestionnairePersonnages gestionnaire = new GestionnairePersonnages();
        Hero mage = gestionnaire.creerMage();
        Hero arion = gestionnaire.creerGuerrier();
        System.out.println(arion.getForce());
        System.out.println(mage.getDescription());

        
    }
}
