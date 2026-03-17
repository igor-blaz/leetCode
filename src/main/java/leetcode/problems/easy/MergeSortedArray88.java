package leetcode.problems.easy;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    //    Переменная	За что отвечает
    //    i	последний реальный элемент nums1
    //    j	последний элемент nums2
    //    k	позиция, куда мы пишем в nums1
    //      {1, 2, 3, 0, 0, 0};
    //     {2, 5, 6};
    //      {1, 2, 3, 0, 0, 0};
    //     {2, 5, 2};

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            //Последний в num2 больше
            if (nums2[j] >= nums1[i]) {
                nums1[k] = nums2[j];
                j--;
                //Последний в num2 меньше
            } else if (nums2[j] <= nums1[i]) {
                nums1[k] = nums1[i];
                i--;
            }

            k--;

            System.out.println(Arrays.toString(nums1));
        }
        System.out.println(Arrays.toString(nums1));
    }
}
