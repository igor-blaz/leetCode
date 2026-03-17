package leetcode.problems.easy;

import leetcode.prepare.RandomVariables;

public class AddDigits258 {
    public static void main(String[] args) {
        int rand = RandomVariables.getRandomInteger(11, 99);
        System.out.println("Сгенерировано число " + rand);
        int result = addDigits(rand);
        System.out.println("Результат  " + result);
    }

    public static int addDigits(int num) {

        while (num >= 10) {
           // повторяем, пока не одна цифра
            int result = 0;

            while (num > 0) {        // складываем цифры
                result += num % 10;
                num = num / 10;
            }

            num = result;            // новая сумма становится числом
            System.out.println("Num " + num);
        }

        return num;
    }
}

