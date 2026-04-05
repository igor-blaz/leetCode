package leetcode.problems.easy;

public class P344ReverseString {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o' };
        reverseString(chars);
    }

    public static void reverseString(char[] s) {
        int first = 0;
        int last = s.length - 1;
        while (first < last) {
            char firstChar = s[first];
            char lastChar = s[last];
            s[first] = lastChar;
            s[last] = firstChar;
            first++;
            last--;
        }
        System.out.println(s);
    }
}
