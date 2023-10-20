package Item;

public class Potion extends Item {
    final int healingPower;

    public Potion(int healingPower) {
        this.healingPower = healingPower;
        if (healingPower < 11)
            setName("Potion faible");
        else if (healingPower < 21)
            setName("Potion");
        else if (healingPower < 31)
            setName("Potion Fort");
        else if (healingPower < 51)
            setName("Potion Extra Fort");
        setDescription("Soigne " + (healingPower) + " HP.");
        setPrice(healingPower / 2);
    }

    public int getHealingPower() {
        return healingPower;
    }
}
