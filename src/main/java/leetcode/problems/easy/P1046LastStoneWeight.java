package leetcode.problems.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class P1046LastStoneWeight {
    public static void main(String[] args) {
        int[] arr = {31, 26, 33, 21, 40};
        System.out.println(lastStoneWeight(arr));
    }

    public static int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int i : stones) {
            list.add(i);
        }
        list.sort(Integer::compareTo);
        while (true) {
            if (list.size() == 1) {
                return list.getFirst();
            }
            list = smash(list);
            list.sort(Integer::compareTo);
        }

    }

    public static List<Integer> smash(List<Integer> list) {
        int result = list.get(list.size() - 1) - list.get(list.size() - 2);
        list.removeLast();
        list.removeLast();
        list.add(result);
        return list;
    }

    public int lastStoneWeight2(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int stone : stones) {
            pq.add(stone);
        }

        while (pq.size() > 1) {
            int y = pq.poll();
            int x = pq.poll();

            if (x != y) {
                pq.add(y - x);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}

