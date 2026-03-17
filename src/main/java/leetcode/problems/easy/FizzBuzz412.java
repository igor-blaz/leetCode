package leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public static void main(String[] args) {
        int nub = 9;
        List<String> answer = fizzBuzz(nub);
        System.out.println(answer);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                list.add("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                list.add("Buzz");
                continue;
            }
            list.add(String.valueOf(i));
        }
        return list;
    }

    public static List<String> fizzBuzzChatGPT(int n) {
        List<String> res = new ArrayList<>(n);
        int fizz = 0, buzz = 0;

        for (int i = 1; i <= n; i++) {
            fizz++;
            buzz++;

            boolean f = (fizz == 3);
            boolean b = (buzz == 5);

            if (f && b) {
                res.add("FizzBuzz");
            } else if (f) {
                res.add("Fizz");
            } else if (b) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }

            if (fizz == 3) fizz = 0;
            if (buzz == 5) buzz = 0;
        }
        return res;
    }
}
