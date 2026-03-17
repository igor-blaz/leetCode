package leetcode.problems.easy.alternative;

import leetcode.prepare.RandomCollections;

import java.util.Arrays;

public class PlusOne66Alternative {
    public static void main(String[] args) {
        int[] array = RandomCollections.getRandomArray(4, 0, 10);
        System.out.println("сгенерировано " + Arrays.toString(array));
        int[] solution = plusOne(array);
        System.out.println("=======================================");
        System.out.println(Arrays.toString(solution));
    }

    public static int[] plusOne(int[] digits) {
        int number = arrayToDigit(digits);
        number += 1;
        System.out.println("NUMBER + 1 = " + number);
        int numberLength = numberLength(number);

        return numberToArray(number, numberLength);
    }

    public static int arrayToDigit(int[] digits) {
        if (digits[0] == 0) {
            System.out.println("Первое число 0 Попробуй перезапустить");
            return -1;
        }
        int number = 0;
        int multiply = 10;
        int length = digits.length;
        for (int i = 0; i < length; i++) {
            int a = digits[length - (i + 1)];
            if (i != 0) {
                a *= multiply;
                multiply *= 10;
            }
            number = number + a;
            System.out.println("итерация " + i + " получилось " + a);
        }
        System.out.println("NUMBER =  " + number);
        return number;
    }

    public static int numberLength(int number) {
        int length = 0;
        while (number != 0) {
            number /= 10;
            length++;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public static int[] numberToArray(int num, int numberLength) {
        int[] array = new int[numberLength];
        int divide = 10;

        for (int i = 0; numberLength - (i + 1) >= 0; i++) {
            array[numberLength - (i + 1)] = num % divide;
            System.out.println("ARRAY " + Arrays.toString(array));
            num /= 10;
        }
        return array;
    }
}

