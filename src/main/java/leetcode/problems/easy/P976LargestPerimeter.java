package leetcode.problems.easy;

import java.util.Arrays;
import java.util.TreeSet;

public class P976LargestPerimeter {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 10};
        System.out.println(largestPerimeter(nums));
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums.length - i - 3 == -1) {
                return 0;
            }
            int max = nums[nums.length - i-1];
            int min1 = nums[nums.length - i - 2];
            int min2 = nums[nums.length - i - 3];

            if (min2 + min1 > max) {
                return max + min1 + min2;
            }

        }
        return 0;
    }
}
