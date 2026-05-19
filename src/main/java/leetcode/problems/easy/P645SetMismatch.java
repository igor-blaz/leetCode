package leetcode.problems.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P645SetMismatch {
    public static void main(String[] args) {
        int[] nums = {2,2};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicateIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean added = set.add(nums[i]);
            if (!added) {
                duplicateIndex = i;
                System.out.println(duplicateIndex);
                break;
            }
        }
        int correctSum = 0;
        for (int i = 1; i < nums.length + 1; i++) {
            correctSum += i;
        }
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
            System.out.println("ff" + actualSum);
        }
        int[] answer = new int[2];
        answer[0] = nums[duplicateIndex];
        answer[1] = nums[duplicateIndex] + correctSum - actualSum;

        System.out.println(correctSum);
        return answer;
    }
}
