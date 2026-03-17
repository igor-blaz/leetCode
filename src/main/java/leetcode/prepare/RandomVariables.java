package leetcode.prepare;

import java.util.Random;

public class RandomVariables {
    public static int getRandomInteger(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }

    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
