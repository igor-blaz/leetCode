package leetcode.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P448FindDisappearedNumbers {
    public static void main(String[] args) {
        // int[] array = RandomCollections.getRandomArray(8, 0, 10);
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> answer = findDisappearedNumbers(array);
        System.out.println(answer);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0){
                nums[index] *= -1;
            }

        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                list.add(i + 1);
            }
        }
        return list;
    }
//Старая версия
//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//
//        int size = nums.length;
//        Map<Integer, Integer> map = makeHasmMap(size);
//        System.out.println(map);
//        for (int num : nums) {
//            map.remove(num);
//        }
//        return map.values().stream().toList();
//    }
//
//    public static Map<Integer, Integer> makeHasmMap(int size) {
//        int i = 1;
//        Map<Integer, Integer> map = new HashMap<>(size);
//        while (i != size + 1) {
//            map.put(i, i);
//            i++;
//        }
//        return map;
//    }
}
