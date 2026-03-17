package leetcode.problems.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class P0125ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println();
        boolean answer = isPalindromeAdvanced(s);
        System.out.println("Ответ " + answer);
    }

    public static boolean isPalindromeTheBest(String s) {
        if (s.isEmpty()) return true;
        int right = s.length() - 1;
        int left = 0;
        while (left < right) {
            //если цифра
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            boolean isDigit = (leftChar >= 48 && leftChar <= 57);
            boolean isLowCase = (leftChar >= 97 && leftChar <= 122);
            //если левый это capsLock
            if (leftChar >= 65 && leftChar <= 90) {
                leftChar += 32;
            } else if (!isDigit && !isLowCase) {
                left++;
                continue;
            }

            boolean isRightDigit = (rightChar >= 48 && rightChar <= 57);
            boolean isRightLowCase = (rightChar >= 97 && rightChar <= 122);
            //если правый это capsLock
            if (rightChar >= 65 && rightChar <= 90) {
                rightChar += 32;
            } else if (!isRightDigit && !isRightLowCase) {
                right--;
                continue;
            }

            if (leftChar != rightChar) {
                return false;
            }
            ++left;
            --right;

        }
        return true;
    }

    public static boolean isPalindromeAdvanced(String s) {
        if (s.isEmpty()) return true;
        int right = s.length() - 1;
        int left = 0;
        while (left < right) {

            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            if (leftChar != rightChar) {
                return false;
            }
            ++left;
            --right;

        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        Deque<Character> deque = new ArrayDeque<>();
        for (Character c : chars) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                deque.push(c);
            }
        }
        while (!deque.isEmpty()) {
            if (deque.size() == 1) {
                break;
            }
            char first = deque.pollFirst();
            char last = deque.pollLast();
            System.out.println(first + " " + last);
            if (first != last) {
                return false;
            }
        }
        return true;
    }
}
