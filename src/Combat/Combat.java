package Combat;

import Character.*;
import Services.Dice;

import static java.lang.Math.round;

public class Combat {
    final private CharacterObject player;
    final private Enemy enemy;
    private static boolean playerIsNext = false;

    public Combat(CharacterObject player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    //Une fonction qui permet de lancer le combat
    public void initCombat() {
        System.out.println("A battle has started between " + player.getName() + " and " + enemy.getName() + "!");

        // Roll a dice to determine who goes first
        int initiativePlayer = Dice.roll(20);
        int initiativeEnemy = Dice.roll(20);
        while (initiativePlayer == initiativeEnemy) {
            initiativePlayer = Dice.roll(20);
            initiativeEnemy = Dice.roll(20);
        }
        if (initiativePlayer > initiativeEnemy) playerIsNext = true;

        if (playerIsNext) {
            System.out.println(player.getName() + " goes first!");
        } else {
            System.out.println(enemy.getName() + " goes first!");
        }
    }

    public void nextTurn(AttackType playerNextAttack) {
        if (playerIsNext) {
            takeTurn(player, enemy, playerNextAttack);
        }
        else {
            takeTurn(enemy, player, AttackType.LIGHT);
        }
    }

    //Une fonction qui permet de faire un tour de combat
    private void takeTurn(CharacterObject attacker, CharacterObject defender, AttackType attackType) {
        int damage = Attack.getDamage(attacker, attackType);
        double defense = Attack.getDefense(defender, attacker, attackType);
        int totalDamage = (int) round(damage-defense*damage);
        System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + (totalDamage) + " damage!");
        defender.getAttributes().setHealthPoints(defender.getAttributes().getHealthPoints() - totalDamage);
        if (!defender.isAlive()) {
            System.out.println(defender.getName() + " has been defeated!");
        }
        playerIsNext = !playerIsNext;
    }


    //Une fonction pour calculer l'expérience gagnée par le joueur
    public int experienceGained() {
        //si tu arrives à battre un ennemi, tu gagnes son expérience
        int experience = enemy.getAttributes().getExperience();
        return experience;
    }
}
