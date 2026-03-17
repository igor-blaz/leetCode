package leetcode.problems.easy;

import leetcode.prepare.RandomVariables;

import java.util.ArrayList;
import java.util.List;

public class P119PascalTriangle2 {
    public static void main(String[] args) {
        int num = RandomVariables.getRandomInteger(0, 10);
        System.out.println("Сгенерировано " + num);
        List<Integer> answer = getRow(num);
        System.out.println(answer);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>(rowIndex);
        list.add(1);  // 1
        if (rowIndex == 0) return list;
        list.add(1); //2
        if (rowIndex == 1) return list;
        for (int i = 0; i <= rowIndex - 2; i++) {
            generate(list);
        }
        return list;
    }

    public static List<Integer> generate(List<Integer> list) {
        list.addLast(1);
        System.out.println(list);
        int size = list.size();
        int replace = size - 2;
        do {
            int num = list.get(replace) + list.get(replace - 1);
            list.set(replace, num);
            replace -= 1;
            System.out.println(list);
        } while (replace >= 1);
        return list;
    }

}
