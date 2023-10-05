import Personnage.*;
public class Main {
    public static void main(String[] args) {
        Guerrier arion = new Guerrier();
        Mage mage = new Mage();
        System.out.println(arion.getForce());
        System.out.println(mage.getDescription());

        
    }
}
