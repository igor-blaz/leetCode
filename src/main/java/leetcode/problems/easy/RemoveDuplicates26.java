package leetcode.problems.easy;

import java.util.Arrays;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length = nums.length;
        int unique = 1;

        for (int i = 1; i < length; i++) {
            int current = nums[i];
            int previous = nums[i - 1];
            System.out.println("кол-во уникальных аргументов " + unique);
            System.out.println(i + " версия " + Arrays.toString(nums));
            System.out.println("current  " + current);
            System.out.println("previous   " + previous);

            if (current != previous) {
                System.out.println("сравнение " + current + " and " + previous);
                nums[unique] = current;  // Перезаписываем текущий уникальный элемент на место
                unique++;  // Увеличиваем индекс для уникального элемента
            }


        }
        System.out.println(Arrays.toString(nums));
        System.out.println(unique);
    }
//    class Solution {
//        public int removeDuplicates(int[] nums) {
//            int unique = 1;
//
//            for (int i = 1; i <  nums.length; i++) {
//                int current = nums[i];
//                int prev = nums[i - 1];
//
//                if (current != prev) {
//                    nums[unique] = current;
//                    unique ++;
//                }
//
//
//            }
//            return unique;
//        }

  //  }
}
