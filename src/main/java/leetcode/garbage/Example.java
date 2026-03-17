package leetcode.garbage;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list);
        //Самое маленькое
        int min1 = Integer.MAX_VALUE;
        //Второе самое маленькое
        int min2 = Integer.MAX_VALUE;
        for (int i : list) {
            if (i < min1) {
                min2 = min1;
                min1 = i;
            } else if (i < min2) {
                min2 = i;
            }
        }
        System.out.println(min1);
        System.out.println(min2);
        int sum = min1 + min2;
        System.out.println(sum);
    }

}
