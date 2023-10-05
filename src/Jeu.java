import Personnage.*;
public class Jeu {
    public static void main(String[] args) {
        Guerrier arion = new Guerrier();
        Mage mage = new Mage();
        System.out.println(arion.getForce());
        System.out.println(mage.getDescription());

        
    }
}
