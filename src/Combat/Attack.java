package Combat;

import Personnage.Personnage;

/*TODO Change the damages and defense equations so they are balanced with the game value (HP, damage, etc)
   And also so they utilize the base damages of the Personnage and of its weapon
   And also implement the dice rolls :p */
public class Attack {
    public static int getLightAttackDamage(Personnage p, AttackType ap){
        if(ap == AttackType.MAGICAL){ // Checks if it is a magic attack
            return (int) (0.75*p.getIntelligence()+0.25*p.getWisdom());
        }
        return (int) (0.75*p.getAgilite()+0.25*p.getForce());
    }
    public static int getHeavyAttackDamage(Personnage p, AttackType ap){
        if(ap == AttackType.MAGICAL){
            return (int) (0.75*p.getWisdom()+0.25*p.getIntelligence());
        }
        return (int) (0.75*p.getForce()+0.25*p.getAgilite());
    }

    public static int getLightAttackDefense(Personnage p, AttackType ap){
        if(ap == AttackType.MAGICAL){ // Checks if it is a magic attack
            return (int) (0.75*p.getIntelligence()+0.25*p.getConstitution());
        }
        return (int) (0.75*p.getConstitution()+0.25*p.getForce());
    }
    public static int getHeavyAttackDefense(Personnage p, AttackType ap){
        if(ap == AttackType.MAGICAL){
            return (int) (0.75*p.getWisdom()+0.25*p.getConstitution());
        }
        return (int) (0.75*p.getConstitution()+0.25*p.getAgilite());
    }
}
