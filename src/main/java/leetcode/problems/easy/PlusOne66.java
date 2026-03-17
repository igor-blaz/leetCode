package leetcode.problems.easy;

import leetcode.prepare.RandomCollections;

import java.util.Arrays;

public class PlusOne66 {
    public static void main(String[] args) {
        int[] array = RandomCollections.getRandomArray(5, 1, 9);
        System.out.println("сгенерировано " + Arrays.toString(array));
        int[] solution = plusOne(array);
        System.out.println("=======================================");
        System.out.println(Arrays.toString(solution));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {   // если цифра не 9
                digits[i]++;       // просто увеличили
                System.out.println("array " + Arrays.toString(digits));
                return digits;     // и сразу готово
            }
            System.out.println("array " + Arrays.toString(digits));
            digits[i] = 0;         // если была 9: делаем 0 и идём левее (перенос)
        }

        // если мы вышли из цикла, значит ВСЕ цифры были 9
        int[] res = new int[digits.length + 1];
        res[0] = 1;                // 1000... (единица и нули)
        return res;
    }


}