package leetcode.problems.easy;


import leetcode.prepare.RandomCollections;
import leetcode.prepare.RandomVariables;

import java.util.Arrays;

public class FindFirstAndLastPosition34 {
    public static void main(String[] args) {
        int[] array = RandomCollections.getRandomArray(100, 0, 10);
        int rand = RandomVariables.getRandomInteger(0, 10);
        System.out.println("Рандомное число " + rand);
        //PrintCollections.printArrayInt(array);
        int[] result = searchRange(array, rand);
        System.out.println("Итого " + Arrays.toString(result));

    }


    //✍️ тут нужен бинарный поиск
    // mid = left + (right - left) / 2;
    public static int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target);
        if (first == nums.length || nums[first] != target) {
            System.out.println("Ошибка");
            return new int[]{-1, -1};
        }
        int last = upperBound(nums, target) - 1;
        return new int[]{first, last};
    }

    // Первый индекс, где nums[i] >= target
    private static int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length; // right = n (полуинтервал)

        while (left < right) {
            int mid = left + (right - left) / 2;
            logging(nums, left, right, mid);
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    // Первый индекс, где nums[i] > target
    private static int upperBound(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            logging(nums, left, right, mid);
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private static void logging(int[] array, int left, int right, int mid) {
        System.out.println(Arrays.toString(array));
        if (array.length == right) {
            System.out.println("Интервал с " + array[left] + " до " + array[right - 1]);
        } else {
            System.out.println("Интервал с " + array[left] + " до " + array[right]);
        }
        System.out.println("Левый индекс " + left);
        System.out.println("Правый  индекс " + right);
        System.out.println("Середина на " + array[mid]);
    }


    //решение без бинарного поиска
//    public static int[] searchRange(int[] nums, int target) {
//        boolean beforeFirst = true;
//        int first = -1;
//        int second = -1;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (beforeFirst) {
//                if (nums[i] == target) {
//                    first = i;
//                    beforeFirst = false;
//                }
//            } else {
//                if (nums[i] == target) {
//                    second = i;
//                }
//            }
//        }
//        if (first != -1 && second == -1) {
//            second = first;
//        }
//        int[] result = new int[2];
//        result[0] = first;
//        result[1] = second;
//        return result;
//
//    }
}
