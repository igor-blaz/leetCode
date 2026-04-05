package leetcode.problems.easy;

import leetcode.prepare.RandomCollections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class p219ContainsDuplicate2 {
    public static void main(String[] args) {
        //int[] arr = RandomCollections.getRandomArray(10, 1, 10);
        int[] arr = new int[]{1, 2, 3, 1, 2, 3};
        System.out.println(Arrays.toString(arr));
        int k = 1;
        boolean ans = containsNearbyDuplicate(arr, k);
        System.out.println("итоговый ответ " + ans);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        if (k >= nums.length) {
            for (int i : nums) {
                if (!set.add(i)) return true;
            }
            return false;
        }
        for (int i = 0; i < k + 1; i++) {
            if (k + 1 > nums.length) break;
            boolean result = set.add(nums[i]);
            System.out.println(nums[i] + " успешно добавлен");
            if (!result) {
                System.out.println(nums[i] + " это повтор");
                return true;
            }
        }
        System.out.println("сет в начале" + set);
        for (int i = 0; i <= nums.length && k + 1 + i < nums.length; i++) {
            System.out.println("сет в начале " + set);
            System.out.println("второй цикл ");
            set.remove(nums[i]);
            System.out.println("убрали " + nums[i]);
            if (!set.add(nums[i + k + 1])) return true;
            System.out.println("добавили " + nums[i + k + 1]);
            System.out.println(set);
        }


        return false;
    }


}
