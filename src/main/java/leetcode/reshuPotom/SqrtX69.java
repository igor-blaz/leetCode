package leetcode.reshuPotom;

import leetcode.prepare.RandomVariables;

public class SqrtX69 {
    public static void main(String[] args) {
        int x = RandomVariables.getRandomInteger(0, 10);
        System.out.println(x);
        int solution = mySqrt(x);
        System.out.println(solution);
    }

    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {   // mid*mid <= x (без переполнения)
                ans = mid;          // mid подходит
                left = mid + 1;     // пробуем больше
            } else {
                right = mid - 1;    // mid слишком большой
            }
        }

        return ans;
    }

}
