package leetcode.problems.easy;

import leetcode.prepare.RandomVariables;

public class P0367PerfectSquare {
    public static void main(String[] args) {
        int num = RandomVariables.getRandomInteger(0, 100);
        System.out.println("Сгенерирован " + num);
        System.out.println("Квадрат = " + Math.sqrt(num));
        boolean answer = isPerfectSquare(num);
        System.out.println(answer);
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        int left = 1;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            long squareMid = (long) mid * mid;
            System.out.println("Left = " + left);
            System.out.println("Right = " + right);
            System.out.println("Mid = " + mid);
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");
            if (squareMid == num) {
                return true;
                //если середина больше числа
            } else if (num > squareMid) {
                System.out.println();
                left = mid + 1;
                //Если середина меньше числа
            } else {
                right = mid - 1;

            }
        }
        return false;
    }

    public static boolean isPerfectSquareLC(int num) {
        if (num < 2) return true;
        int left = 1;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            long squareMid = (long) mid * mid;
            if (squareMid == num) {
                return true;
                //если середина больше числа
            } else if (num > squareMid) {
                left = mid + 1;
                //Если середина меньше числа
            } else {
                right = mid - 1;

            }
        }
        return false;
    }
}



