package leetcode.problems.easy;

import leetcode.prepare.RandomVariables;

import java.util.HashSet;
import java.util.Set;

public class P202HappyNumber {
    public static void main(String[] args) {
        int num = RandomVariables.getRandomInteger(0, 100);
        num = 19;
        System.out.println("Сгенерировано " + num);
        System.out.println(isHappy(num));
    }

    public static boolean isHappy(int n) {
        Set<Integer> integers = new HashSet<>();

        return check(n, integers);
    }

    public static boolean check(int n, Set<Integer> integers) {
        System.out.println("Получили " + integers);
        System.out.println("n == " + n);

        int squareSum = 0;
        int nCopy = n;
        do {
            int lastDigit = nCopy % 10;
            nCopy = nCopy / 10;
            squareSum += (lastDigit * lastDigit);
        } while (nCopy >= 10);
        squareSum += nCopy * nCopy;
        System.out.println("found " + squareSum);
        if (squareSum == 1) {
            return true;
        } else if (integers.contains(squareSum)) {
            System.out.println("Contains " + squareSum);
            return false;
        } else {
            System.out.println(" добавили SquareSum " + squareSum);
            integers.add(squareSum);
            System.out.println("Отправили в рекурсию " + integers);

            return check(squareSum, integers);
        }
    }

}
