package leetcode.problems.easy;

import java.util.*;

public class P136SingleNumber {
    public static void main(String[] args) {
        int[] nums = {6,6,9};
        int answer = singleNumber(nums);
        System.out.println(answer);
    }

    public static int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.merge(i, 1, Integer::sum);
        }
        Set<Map.Entry<Integer, Integer>> entryset = map.entrySet();
        for(Map.Entry<Integer, Integer> entry : entryset){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
