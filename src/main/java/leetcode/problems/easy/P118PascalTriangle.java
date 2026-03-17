package leetcode.problems.easy;

import leetcode.prepare.RandomVariables;

import java.util.ArrayList;
import java.util.List;

public class P118PascalTriangle {
    public static void main(String[] args) {
        int num = RandomVariables.getRandomInteger(0, 9);
        System.out.println("Сгенерировано " + num);
        List<List<Integer>> answer = generate(1);
        System.out.println(answer);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        List<Integer> previousRow = firstRow;

        for (int i = 1; i < numRows; i++) {
            List<Integer> nextRow = buildNextRow(previousRow);
            triangle.add(nextRow);
            previousRow = nextRow;
        }

        return triangle;
    }

    public static List<Integer> buildNextRow(List<Integer> previousRow) {
        int size = previousRow.size();
        List<Integer> nextRow = new ArrayList<>(size + 1);

        nextRow.add(1);

        for (int i = 1; i < size; i++) {
            nextRow.add(previousRow.get(i - 1) + previousRow.get(i));
        }

        nextRow.add(1);

        return nextRow;
    }
}