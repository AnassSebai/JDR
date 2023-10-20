//Gestion du jeu


import Combat.*;
import Personnage.Enemy;
import Personnage.GestionnaireEnemies;
import Personnage.GestionnaireHeros;
import Personnage.Hero;

public class Jeu {
    // Votre logique de jeu ici
    
    public void demarrer() {
        // Démarrez le jeu ici
        Hero guerrier = GestionnaireHeros.creerGuerrier();
        Enemy bandit = GestionnaireEnemies.createBandit();
        Combat combat = new Combat(guerrier, bandit);
        combat.initCombat();
        System.out.println(guerrier.getPointsDeVie());
        System.out.println(bandit.getPointsDeVie());
        while(guerrier.isAlive() && bandit.isAlive()){
            combat.nextTurn(AttackType.HEAVY);
            System.out.println(guerrier.getPointsDeVie());
            System.out.println(bandit.getPointsDeVie());
        }

        Enemy zombie = GestionnaireEnemies.createZombie();
        combat = new Combat(guerrier, zombie);
        combat.initCombat();
        System.out.println(guerrier.getPointsDeVie());
        System.out.println(zombie.getPointsDeVie());
        while(guerrier.isAlive() && zombie.isAlive()){
            combat.nextTurn(AttackType.HEAVY);
            System.out.println(guerrier.getPointsDeVie());
            System.out.println(zombie.getPointsDeVie());
        }

        Enemy wolf = GestionnaireEnemies.createWolf();
        combat = new Combat(guerrier, wolf);
        combat.initCombat();
        System.out.println(guerrier.getPointsDeVie());
        System.out.println(zombie.getPointsDeVie());
        while(guerrier.isAlive() && wolf.isAlive()){
            combat.nextTurn(AttackType.HEAVY);
            System.out.println(guerrier.getPointsDeVie());
            System.out.println(wolf.getPointsDeVie());
        }
    }
    
    // Autres méthodes pour gérer le jeu
}
