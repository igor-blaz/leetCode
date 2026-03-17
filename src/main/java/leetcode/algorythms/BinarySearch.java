package leetcode.algorythms;

import leetcode.prepare.RandomCollections;
import leetcode.prepare.RandomVariables;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int num = RandomVariables.getRandomInteger(0, 10);
        int[] array = RandomCollections.getSortedArray(8, 0, 10);
        int answer = binarySearch(num, array);
        System.out.println(answer);
    }

    private static int binarySearch(int num, int[] array) {

        System.out.println("искомое число " + num);
        int left = 0;                          // начинаем с первого индекса
        int right = array.length - 1;          // последний индекс включаем

        while (left <= right) {                // пока диапазон не пустой
            int mid = left + (right - left) / 2;  // безопасная середина
            logging(array, left, right, mid);
            if (array[mid] == num) {
                return mid;                    // нашли — возвращаем индекс
            } else if (array[mid] < num) {
                System.out.println("ARRAY[mid] " + array[mid]);
                // искомое число больше середины
                // значит всё слева от mid нам уже не нужно
                // включая сам mid (он слишком маленький)

                left = mid + 1;                // сдвигаем левую границу правее
            } else { // array[mid] > num
                // искомое число меньше середины
                // значит всё справа от mid нам не нужно
                // включая сам mid (он слишком большой)

                right = mid - 1;               // сдвигаем правую границу левее
            }
        }

        return -1; // если не нашли
    }

    private static void logging(int[] array, int left, int right, int mid) {
        System.out.println(Arrays.toString(array));
        if (array.length == right) {
            System.out.println("Интервал с " + left + " до " + (right - 1));
        } else {
            System.out.println("Интервал с " + left + " до " + right);
        }
        System.out.println("Левый индекс " + left);
        System.out.println("Правый  индекс " + right);
        System.out.println("mid index " + mid);
    }
}
