package Item;

import Combat.AttackType;

public class Weapon extends Item{
    final int baseDamage;
    final AttackType attackType;

    public Weapon(int damage, String name, String description, AttackType attackType) {
        baseDamage = damage;
        this.attackType = attackType;
        setPrice(damage*5);
        setDescription(description);
        setName(name);
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public AttackType getAttackType() {
        return attackType;
    }
}
