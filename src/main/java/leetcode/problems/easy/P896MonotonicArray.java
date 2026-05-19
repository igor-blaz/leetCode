package leetcode.problems.easy;

public class P896MonotonicArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(isMonotonic(nums));
    }

    public static boolean isMonotonic(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums.length <= i + 1) {
                return true;
            }
            if (nums[i] > nums[i + 1]) {
                return isDecreasing(nums);
            }
            if (nums[i] < nums[i + 1]) {
                return isIncreasing(nums);
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums.length <= i + 1) {
                return true;
            }
            if (nums[i] < nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIncreasing(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums.length <= i + 1) {
                return true;
            }
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
