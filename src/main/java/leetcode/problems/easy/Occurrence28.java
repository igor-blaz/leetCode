package leetcode.problems.easy;

public class Occurrence28 {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        int occurrence = strStr(haystack, needle);
        System.out.println("Occurrence " + occurrence);
    }

    public static int strStr(String haystack, String needle) {
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        int firstOccurrence = 0;
        int rightBefore = 0;
        for (int i = 0; i < haystackArray.length; i++) {
            System.out.println("шаг " + i + ": сравниваем " + needleArray[rightBefore] + " и " +
                    haystackArray[i]);
            if (needleArray[rightBefore] == haystackArray[i] && rightBefore == 0) {
                firstOccurrence = i;
                rightBefore++;
                System.out.println("Равно впервые");

            } else if (needleArray[rightBefore] == haystackArray[i] && rightBefore > 0) {
                rightBefore++;
                System.out.println("Снова равно");

            } else if (needleArray[rightBefore] != haystackArray[i]) {
                if (rightBefore > 0) {
                    // откатываемся и пробуем начать с next start
                    i = firstOccurrence;   // цикл сделает i++ => firstOccurrence+1
                }
                System.out.println("Не равно (");
                rightBefore = 0;

            }

            if (rightBefore == needleArray.length) {
                System.out.println("Выход из цикла");
                return firstOccurrence;
            }

        }
        return -1;
    }
//версия чатгпт
//    class Solution {
//        public int strStr(String haystack, String needle) {
//            if (needle.isEmpty()) return 0;
//            if (needle.length() > haystack.length()) return -1;
//
//            char[] h = haystack.toCharArray();
//            char[] n = needle.toCharArray();
//
//            int firstOccurrence = 0;
//            int matched = 0; // твой rightBefore
//
//            for (int i = 0; i < h.length; i++) {
//
//                if (h[i] == n[matched]) {
//                    if (matched == 0) firstOccurrence = i;
//                    matched++;
//
//                    if (matched == n.length) return firstOccurrence;
//
//                } else {
//                    if (matched > 0) {
//                        i = firstOccurrence; // откат -> след. шаг будет firstOccurrence + 1
//                    }
//                    matched = 0;
//                }
//            }
//
//            return -1;
//        }
//    }

}
