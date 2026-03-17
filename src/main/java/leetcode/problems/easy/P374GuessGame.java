package leetcode.problems.easy;

import leetcode.prepare.RandomVariables;

public class P374GuessGame {
    public static int guessIt = 0;
    public static int trying = 0;

    public static void main(String[] args) {
        guessIt = RandomVariables.getRandomInteger(0, 50);
        System.out.println("Сгенерировано " + guessIt);
        guessNumber(50);
    }

    public static int guess(int guess) {
        System.out.println("Попытка " + trying + " загадано " + guess);
        trying++;
        //Предположение меньше
        if (guess < guessIt) {
            return 1;
            //предположение больше
        } else if (guess > guessIt) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int guessNumber(int n) {
        int lowerBound = 0;
        int upperBound = n;
        int guessResult = 1;
        int current = 0;
        while (guessResult != 0) {
            current = lowerBound + (upperBound - lowerBound) / 2;

            guessResult = guess(current);
            //если надо брать выше
            if (guessResult == -1) {
                System.out.println("Надо брать выше");
                upperBound = current - 1;

                //Если надо брать ниже
            } else if (guessResult == 1) {
                System.out.println("Надо брать ниже");
                lowerBound = current + 1;
            }

        }

        return current;
    }
}
