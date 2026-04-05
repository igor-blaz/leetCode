package leetcode.problems.easy;

import leetcode.prepare.RandomCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P217ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = RandomCollections.getRandomArray(10, 0, 10);
        System.out.println(Arrays.toString(arr));
        boolean answer = containsDuplicate(arr);
        System.out.println(answer);
    }

    public static boolean containsDuplicate(int[] nums) {
        int distinct = ((int) Arrays.stream(nums).distinct().count());
        int numSize = nums.length;
        return numSize != distinct;
    }

    public boolean containsDuplicateRight(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

}
