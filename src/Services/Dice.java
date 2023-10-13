package Services;

import java.util.Random;

public class Dice {
    public static int roll(int numberOfFaces) {
        if (numberOfFaces <= 0) {
            throw new IllegalArgumentException("Number of faces must be greater than 0.");
        }

        Random random = new Random();
        return random.nextInt(numberOfFaces) + 1;
    }
}
