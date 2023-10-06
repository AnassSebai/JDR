import Personnage.GestionnairePersonnages;
import Personnage.Hero.Hero;

public class Main {
    public static void main(String[] args) {
        Hero mage = GestionnairePersonnages.creerMage();
        Hero arion = GestionnairePersonnages.creerGuerrier();
        System.out.println(arion.getForce());
        System.out.println(mage.getDescription());
    }
}
