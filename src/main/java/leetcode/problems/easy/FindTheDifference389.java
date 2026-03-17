package leetcode.problems.easy;

public class FindTheDifference389 {
    public static void main(String[] args) {
        String one = "qwwerty";
        String two = "qwerty";
        char answer = findTheDifference(one, two);
        char answer2 = findTheDifferenceChatGPT(one, two);
        System.out.println(answer);
    }

    public static char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int sAsciiSum = asciiSum(sChars);
        int tAsciiSum = asciiSum(tChars);
        int answerSum = sAsciiSum - tAsciiSum;
        if (answerSum < 0) {
            answerSum *= -1;
        }
        System.out.println("Ответ "+answerSum);
        return (char) answerSum;
    }

    public static int asciiSum(char[] chars) {
        if (chars.length == 0) return 0;
        int sum = 0;
        for (char c : chars) {
            System.out.println(c + " В ASCII = " + (int) c);
            sum += c;
        }
        System.out.println("Получилась сумма " + sum);
        return sum;
    }

    public static char findTheDifferenceChatGPT(String s, String t) {
        int xor = 0;

        for (char c : s.toCharArray()) {
            xor ^= c;
            System.out.println(xor);
        }

        for (char c : t.toCharArray()) {
            xor ^= c;
            System.out.println(xor);
        }

        return (char) xor;
    }
}
