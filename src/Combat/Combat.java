package Combat;
import Personnage.*;
import Personnage.Enemy.*;

import java.util.Random;

public class Combat {
        final private Personnage player;
        final private Enemy enemy;

        public Combat(Personnage player, Enemy enemy) {
            this.player = player;
            this.enemy = enemy;
        }
        //Une fonction qui permet de lancer le combat
        public void initCombat() {
            System.out.println("A battle has started between " + player.getNom() + " and " + enemy.getNom() + "!");

            // Roll a dice to determine who goes first
            Random random = new Random();
            boolean playerGoesFirst = random.nextBoolean();

            if (playerGoesFirst) {
                System.out.println(player.getNom() + " goes first!");
                takeTurn(player, enemy);
            } else {
                System.out.println(enemy.getNom() + " goes first!");
                takeTurn(enemy, player);
            }
        }


        //Une fonction qui permet de faire un tour de combat
        private void takeTurn(Personnage attacker, Personnage defender) {
            int damage = attaque(attacker, defender);
            System.out.println(attacker.getNom() + " attacks " + defender.getNom() + " for " + damage + " damage!");
            if (defender.isAlive()) {
                takeTurn(defender, attacker);
            } else {
                System.out.println(defender.getNom() + " has been defeated!");
            }
        }

        //Une fonction qui permet de faire une attaque et de calculer les dégats
        private int attaque(Personnage attacker, Personnage defender) {
            /*int damage = attacker.getAttack() - defender.getDefense();
            if (damage < 0) {
                damage = 0;
            }
            defender.takeDamage(damage);
            return damage;*/
            return 0;
        }

        //Une fonction qui permet de faire une attaque spéciale d'un héro et de calculer les dégats
        private int specialAttack(Personnage attacker, Personnage defender) {
            /*int damage = attacker.getSpecialAttack() - defender.getDefense();
            if (damage < 0) {
                damage = 0;
            }
            defender.takeDamage(damage);
            return damage;*/
            return 0;
        }
        
        //Une fonction pour calculer l'expérience gagnée par le joueur
        public int experienceGained() {
            //si tu arrives à battre un ennemi, tu gagnes son expérience
            int experience = enemy.getExperience();
            return experience;
        } 
}
