package leetcode.problems.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses20 {
    public static void main(String[] args) {
        String s = "({[{()}]})";
        String d = "{}{}";
        boolean answer;
        answer = isValid(d);
        System.out.println(answer);
    }

    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();
        if (chars.length % 2 != 0) return false;
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : chars) {

            if (c == '(' || c == '[' || c == '{') {
                System.out.println("✅" + c + " открывающаяся. Кладем в стек");
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char last = stack.peek();
                System.out.println("❌" + c + " Закрывающаяся. " + last + " попробует раскрыть " + c);
                if (c == '}' && last != '{') return false;
                if (c == ')' && last != '(') return false;
                if (c == ']' && last != '[') return false;
                System.out.println("Удаляем " + stack.peek());
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            System.out.println("Стек не пустой! Возвращаем false");
            return false;
        }
        return true;


    }
}
