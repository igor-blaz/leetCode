package leetcode.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class P349IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {7, 3, 5, 3, 9, 7};
        int[] nums2 = {3, 3, 7, 10};

        int[] answer = intersection(nums1, nums2);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> numsSet1 = new TreeSet<>();
        TreeSet<Integer> numsSet2 = new TreeSet<>();
        List<Integer> intersection = new ArrayList<>();

        for (int i : nums1) {
            numsSet1.add(i);
        }
        for (int i : nums2) {
            numsSet2.add(i);
        }

        List<Integer> list1 = new ArrayList<>(numsSet1);
        List<Integer> list2 = new ArrayList<>(numsSet2);

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            int a = list1.get(i);
            int b = list2.get(j);

            if (a == b) {
                intersection.add(a);
                i++;
                j++;
            } else if (a < b) {
                i++;
            } else {
                j++;
            }
        }

        return intersection.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}