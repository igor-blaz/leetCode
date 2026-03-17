package leetcode.problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P0001TwoSum {
    public static void main(String[] args) {
        int[] array = {3, 2, 4};
        int target = 6;
        int[] answer = twoSumAdvanced(array, target);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println("put " + nums[i] + " and " + i);
            map.put(nums[i], i);
        }
        System.out.println("map " + map);
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            System.out.println("Key " + key);
            if (map.containsKey(key)) {
                if (map.get(key) == i) {
                    continue;
                }
                System.out.println("Индекс " + map.get(key));
                return new int[]{i, map.get(key)};
            }
        }
        System.out.println("For Закончился");
        return null;
    }

    public  static  int[] twoSumAdvanced(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}
