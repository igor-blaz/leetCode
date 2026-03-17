package leetcode.problems.easy;

import leetcode.prepare.RandomCollections;
import leetcode.prepare.RandomVariables;

import java.util.Arrays;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int[] array = RandomCollections.getSortedArray(5, 0, 10);
        int target = RandomVariables.getRandomInteger(0, 10);
        System.out.println("🔥 " + Arrays.toString(array));
        System.out.println("🔥 " + target);
        int answer = searchInsert(array, target);
        System.out.println("Ответ " + answer);

    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        //найти первый индекс, где target > mid
        while (left < right) {
            int mid = left + (right - left) / 2;
            //Если target больше середины и находится правее.
            if (nums[mid] < target) {
                left = mid + 1;
                //Если target больше середины и находится правее.
            } else if (nums[mid] >= target) {
                right = mid;
            }

        }
        return left;
    }
}
