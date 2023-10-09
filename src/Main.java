import Personnage.Enemy.Enemy;
import Personnage.GestionnairePersonnages;
import Personnage.Hero.Hero;

public class Main {
    public static void main(String[] args) {
        Hero mage = GestionnairePersonnages.creerMage();
        Hero arion = GestionnairePersonnages.creerGuerrier();
        Enemy en = new Enemy(1,1,1,1,1,"il",1,1);

        System.out.println(arion.getForce());
        System.out.println(mage.getDescription());
        System.out.println(en.getNom());
    }
}
