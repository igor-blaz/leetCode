package leetcode.garbage;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 2, 2, 4, 8);
        int result = 0;
        for (int i : list) {
            result |= i;
            System.out.println(result);
        }
        boolean isOdd = result % 2 == 1;
        System.out.println(isOdd);
    }
}
