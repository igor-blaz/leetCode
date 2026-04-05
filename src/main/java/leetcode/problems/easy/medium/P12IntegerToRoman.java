package leetcode.problems.easy.medium;

import leetcode.prepare.RandomVariables;

public class P12IntegerToRoman {
    public static void main(String[] args) {
        int rand = RandomVariables.getRandomInteger(0, 3000);
        System.out.println("сгенерировано " + rand);
        System.out.println(intToRoman(rand));
    }

    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};



        return null;

    }

}
