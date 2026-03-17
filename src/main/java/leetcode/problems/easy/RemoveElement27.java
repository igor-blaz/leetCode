package leetcode.problems.easy;

import leetcode.prepare.RandomCollections;
import leetcode.prepare.RandomVariables;

import java.util.Arrays;

public class RemoveElement27 {
    public static void main(String[] args) {
        int[] array = RandomCollections.getRandomArray(10, 0, 4);
        System.out.println("Исходный массив " + Arrays.toString(array));
        int val = RandomVariables.getRandomInteger(0, 4);
        System.out.println("VAL == " + val);
        int result = removeElement(array, val);
        System.out.println("Результат " + result);
    }

    public static int removeElement(int[] nums, int val) {

//        Входные данные: nums = [3,2,2,3], val = 3
//        Выходные данные: 2, nums = [2,2,_,_]

        int nonValCount = 0;
        int insertIndex = 0;


        for (int i = 0; i < nums.length; i++) {

            //Если число не равно вал
            if (nums[i] != val) {
                nums[insertIndex] = nums[i];
                nonValCount++;
                insertIndex++;
            }
            System.out.println(Arrays.toString(Arrays.copyOf(nums, insertIndex)));
        }
        System.out.println("Итого " + Arrays.toString(nums));
        return nonValCount;

    }
}
