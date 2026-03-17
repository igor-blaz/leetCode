package leetcode.problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P205IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean answer = isIsomorphic(s, t);
        System.out.println(answer);
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> sTotMap = new HashMap<>(s.length());
        Map<Character, Character> tTosMap = new HashMap<>(t.length());
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for (int i = 0; i < sArray.length; i++) {
            tTosMap.put(tArray[i], sArray[i]);
            sTotMap.put(sArray[i], tArray[i]);
        }
        String sTranslated = translate(sArray, sTotMap);
        String tTranslated = translate(tArray, tTosMap);
        System.out.println(sTranslated +" -> "+ t);
        System.out.println(tTranslated +" -> "+ s);
        return sTranslated.equals(t) && tTranslated.equals(s);

    }

    public static String translate(char[] array, Map<Character, Character> dictionary) {
        char[] translation = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            translation[i] = dictionary.get(array[i]);
        }
        return new String(translation);
    }
}
