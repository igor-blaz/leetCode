package leetcode.problems.easy;

public class P268MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int answer = missingNumber(nums);
        System.out.println(answer);
    }

    public static int missingNumber(int[] nums) {
        int plusValue = 0;
        int arraySum = 0;
        while (plusValue != nums.length + 1) {
            System.out.println(plusValue);
            arraySum += plusValue;
            plusValue++;
        }
        System.out.println(arraySum);
        for (int i : nums) {
            arraySum -= i;
        }
        return arraySum;
    }
}
