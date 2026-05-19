package leetcode.problems.easy;

import leetcode.prepare.RandomCollections;

import java.util.*;

public class P506RelativeRanks {
    public static void main(String[] args) {
        int[] score = {10, 3, 8, 9, 4};
        String[] answer = findRelativeRanks(score);
        System.out.println("answer " + Arrays.toString(answer));
    }

    public static String[] findRelativeRanks(int[] score) {
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        for (int i : score) {
            treeSet.add(i);
        }
        List<Integer> list = new ArrayList<>(treeSet);
        String[] array = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int rank = list.indexOf(score[i]) + 1;

            if (rank == 1) {
                array[i] = "Gold Medal";
            } else if (rank == 2) {
                array[i] = "Silver Medal";
            } else if (rank == 3) {
                array[i] = "Bronze Medal";
            } else {
                array[i] = String.valueOf(rank);
            }
        }
        return array;
    }
}
