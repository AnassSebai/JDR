package Combat;
import Personnage.*;
import java.util.Random;

public class Combat {
        private Personnage player;
        private Enemy enemy;

        public Combat(Personnage player, Enemy enemy) {
            this.player = player;
            this.enemy = enemy;
        }
        //Une fonction qui permet de lancer le combat
        public void initCombat() {
            System.out.println("A battle has started between " + player.getName() + " and " + enemy.getName() + "!");

            // Roll a dice to determine who goes first
            Random random = new Random();
            boolean playerGoesFirst = random.nextBoolean();

            if (playerGoesFirst) {
                System.out.println(player.getName() + " goes first!");
                takeTurn(player, enemy);
            } else {
                System.out.println(enemy.getName() + " goes first!");
                takeTurn(enemy, player);
            }
        }


        //Une fonction qui permet de faire un tour de combat
        private void takeTurn(Character attacker, Character defender) {
            int damage = attaque(attacker, defender);
            System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damage + " damage!");
            if (defender.isAlive()) {
                takeTurn(defender, attacker);
            } else {
                System.out.println(defender.getName() + " has been defeated!");
            }
        }

        //Une fonction qui permet de faire une attaque et de calculer les dégats
        private int attaque(Character attacker, Character defender) {
            int damage = attacker.getAttack() - defender.getDefense();
            if (damage < 0) {
                damage = 0;
            }
            defender.takeDamage(damage);
            return damage;
        }

        //Une fonction qui permet de faire une attaque spéciale d'un héro et de calculer les dégats
        private int specialAttack(Character attacker, Character defender) {
            int damage = attacker.getSpecialAttack() - defender.getDefense();
            if (damage < 0) {
                damage = 0;
            }
            defender.takeDamage(damage);
            return damage;
        }
        
        //Une fonction pour calculer l'expérience gagnée par le joueur
        public int experienceGained() {
            //si tu arrives à battre un ennemi, tu gagnes son expérience
            int experience = enemy.getExperience();
            return experience;
        } 
}
