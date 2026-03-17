package leetcode.prepare;

import java.util.Arrays;

public class PrintCollections {
    public static void printArrayInt(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
        String a = Arrays.toString(array);
        System.out.println(a);
    }
}
