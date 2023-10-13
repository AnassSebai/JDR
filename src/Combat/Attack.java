package Combat;

import Personnage.Personnage;
import Services.*;

import static java.lang.Math.round;

/*TODO Change the damages and defense equations so they are balanced with the game value (HP, damage, etc)
   And also so they utilize the base damages of the Personnage and of its weapon
   And also implement the dice rolls :p */
public class Attack {
    private static int getModifier(int ability) {
        if (ability > 29) return 14;
        if (ability > 27) return 13;
        if (ability > 25) return 12;
        if (ability > 23) return 11;
        if (ability > 21) return 10;
        if (ability > 19) return 9;
        if (ability > 17) return 8;
        if (ability > 15) return 7;
        if (ability > 13) return 6;
        if (ability > 11) return 5;
        if (ability > 9) return 4;
        if (ability > 7) return 3;
        if (ability > 5) return 2;
        if (ability > 3) return 1;
        if (ability > 1) return 0;
        return -1;
    }

    private static double getDamageModifier(int roll) {
        if (roll > 19) return 1.5;
        if (roll > 17) return 1.2;
        if (roll > 15) return 1.0;
        if (roll > 13) return 0.9;
        if (roll > 11) return 0.8;
        if (roll > 9) return 0.7;
        if (roll > 7) return 0.6;
        if (roll > 5) return 0.55;
        if (roll > 3) return 0.5;
        if (roll > 1) return 0.4;
        return 0.1;
    }

    public static int getDamage(Personnage p, AttackType lightOrHeavy) {
        AttackType magicalOrPhysical = p.getWeapon().getAttackType();
        if (lightOrHeavy == AttackType.LIGHT) return getLightAttackDamage(p, magicalOrPhysical);
        return getHeavyAttackDamage(p, magicalOrPhysical);
    }

    public static double getDefense(Personnage attacked, Personnage attacker, AttackType lightOrHeavy) {
        AttackType magicalOrPhysical = attacker.getWeapon().getAttackType();
        if (lightOrHeavy == AttackType.LIGHT) return getLightAttackDefense(attacked, magicalOrPhysical);
        return getHeavyAttackDefense(attacked, magicalOrPhysical);
    }

    public static int getLightAttackDamage(Personnage p, AttackType ap) {
        int roll = Dice.roll(20);
        //System.out.println("roll = " + roll);
        double damageMod = getDamageModifier(roll);
        //System.out.println("damageMod = " + damageMod);
        int weaponDamage = p.getWeapon().getBaseDamage();
        //System.out.println("weaponDamage = " + weaponDamage);
        int weaponRoll = Dice.roll(weaponDamage);
        //System.out.println("weaponRoll = " + weaponRoll);
        int damage;
        if (ap == AttackType.MAGICAL) { // Checks if it is a magic attack
            damage = getModifier(p.getIntelligence()) + getModifier(p.getWisdom()) / 2;
        } else damage = getModifier(p.getAgilite()) + getModifier(p.getForce());
        if (damage < 0) damage = 0;
        //System.out.println("damage = " + damage);
        //System.out.println("damage = " + round((damage) * damageMod+ weaponRoll));
        return (int) round((damage) * damageMod + weaponRoll);
    }

    public static int getHeavyAttackDamage(Personnage p, AttackType ap) {
        int roll = Dice.roll(20);
        //System.out.println("roll = " + roll);
        double damageMod = getDamageModifier(roll);
        //System.out.println("damageMod = " + damageMod);
        int weaponDamage = p.getWeapon().getBaseDamage();
        //System.out.println("weaponDamage = " + weaponDamage);
        int weaponRoll = Dice.roll(weaponDamage);
        //System.out.println("weaponRoll = " + weaponRoll);
        int damage;
        if (ap == AttackType.MAGICAL) {
            damage = getModifier(p.getWisdom()) + getModifier(p.getIntelligence()) / 2;
        } else damage = getModifier(p.getForce()) + getModifier(p.getAgilite()) / 2;
        if (damage < 0) damage = 0;
        //System.out.println("damage = " + damage);
        return (int) round((damage) * damageMod + weaponRoll);
    }

    public static double getLightAttackDefense(Personnage p, AttackType ap) {
        if (ap == AttackType.MAGICAL) { // Checks if it is a magic attack
            return (double) (0.75 * p.getIntelligence() + 0.25 * p.getConstitution())/60;
        }
        return (double) (0.75 * p.getConstitution() + 0.25 * p.getForce())/60;
    }

    public static double getHeavyAttackDefense(Personnage p, AttackType ap) {
        if (ap == AttackType.MAGICAL) {
            return (double) (0.75 * p.getWisdom() + 0.25 * p.getConstitution())/60;
        }
        return (double) (0.75 * p.getConstitution() + 0.25 * p.getAgilite())/60;
    }
}
