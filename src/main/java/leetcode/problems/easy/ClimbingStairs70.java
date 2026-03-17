package leetcode.problems.easy;

import leetcode.prepare.RandomVariables;

public class ClimbingStairs70 {
    public static void main(String[] args) {
        int rand = RandomVariables.getRandomInteger(1, 45);
        System.out.println("Загадано число  " + rand);
        int solution = climbStairs(rand);
        System.out.println("Ответ: " + solution);
    }

    public static int climbStairs(int n) {
//        Числа Фибоначчи — это последовательность натуральных чисел,
//        которая начинается с чисел ноль и один, а каждое последующее
//        число равно сумме двух предыдущих:
//        F = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...}

        //1, 2, 3, 5, 8, 13, 21, 34, 55, ...

        int[] array = new int[n+1];
        for (int i = 0; i <= n; i++) {

            if (i == 0) {
                array[i] = 0;
            } else if (i == 1) {
                array[i] = 1;
            }else{
                array[i] = array[i - 1] + array[i - 2];
            }
            System.out.println("для числа  " + i + " число фибоначчи " + array[i] );
        }
        return array[n] + array[n - 1];


    }
}
