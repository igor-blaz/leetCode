package leetcode.prepare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomCollections {


    public static List<Integer> getRandomList(int size, int min, int max) {
        if (size <= 0) {
            System.out.println("Неверное значение ОСТОРОЖНО");
            return Collections.emptyList();
        }
        Random random = new Random();
        List<Integer> list = new ArrayList<>(size);
        int i = 0;
        while (i != size) {
            Integer integer = random.nextInt(min, max);
            list.add(integer);
            i++;
        }
        return list;
    }

    public static int[] getRandomArray(int size, int min, int max) {
        if (size <= 0) {
            System.out.println("Неверное значение ОСТОРОЖНО");
        }
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            int integer = random.nextInt(min, max);
            array[i] = integer;
        }
        return array;
    }

    public static List<Integer> getSortedList(int size, int min, int max) {
        return getRandomList(size, min, max).stream().sorted().toList();
    }

    public static int[] getSortedArray(int size, int min, int max) {
        List<Integer> list = getSortedList(size, min, max);
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
