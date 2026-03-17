package leetcode.garbage;

public class Example4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("SUM "+sum);
        int squareCount = 0;
        int squareResult = 1;
        while (squareResult < sum) {
            squareResult = 2 * squareResult;
            squareCount++;
        }
        System.out.println(squareResult);
        System.out.println(squareCount);
    }
}
