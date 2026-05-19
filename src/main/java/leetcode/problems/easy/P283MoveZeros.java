package leetcode.problems.easy;

import java.util.Arrays;

public class P283MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int zeroIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && zeroIndex == -1) {
                zeroIndex = i;
            }

            if (nums[i] != 0 && zeroIndex != -1) {
                nums[zeroIndex] = nums[i];
                nums[i] = 0;
                zeroIndex++;
            }
        }
    }
}