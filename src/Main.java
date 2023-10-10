import Personnage.Enemy.Enemy;
import Personnage.Gestionnaire.GestionnaireEnemies;
import Personnage.Gestionnaire.GestionnaireHeros;
import Personnage.Hero.Hero;

public class Main {
    public static void main(String[] args) {
        Hero mage = GestionnaireHeros.creerMage();
        Hero arion = GestionnaireHeros.creerGuerrier();
        Enemy bandit = GestionnaireEnemies.createBandit();
        System.out.println(bandit.getNom());
    }
}
