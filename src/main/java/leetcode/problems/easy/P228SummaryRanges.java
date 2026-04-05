package leetcode.problems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P228SummaryRanges {
    public static void main(String[] args) {
        int[] nums = new int[]{0,2,3,4,6,8,9};
        List<String> answer = summaryRanges(nums);
        System.out.println(answer);
    }

    public static List<String> summaryRanges(int[] nums) {
        if(nums.length==0)return Collections.emptyList();
        List<String> answer = new ArrayList<>();
        int first = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(i+1==nums.length){
                if(first==nums[i]){
                    answer.add(String.valueOf(nums[i]));
                }else{
                    answer.add(first + "->" + nums[i]);
                }
                return answer;
            }
            if (nums[i] + 1 != nums[i + 1]) {
                if(first==nums[i]){
                    answer.add(String.valueOf(nums[i]));
                }else{
                    answer.add(first + "->" + nums[i]);
                }

                System.out.println("разрыв ");
                first = nums[i + 1];
                System.out.println("новая первая " + first);

            }
            System.out.println(nums[i]);
        }
        return answer;
    }
}
