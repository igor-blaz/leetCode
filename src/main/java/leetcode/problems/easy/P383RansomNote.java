package leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class P383RansomNote {
    public static void main(String[] args) {
        String ransomNote = "zooble";
        String magazine = "Hello";
        boolean canConstruct = canConstruct(ransomNote, magazine);
        System.out.println(canConstruct);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>(magazine.length());
        char[] magazineChars = magazine.toCharArray();
        char[] ransomNoteChars = ransomNote.toCharArray();
        Integer charQuantity;
        for (char c : magazineChars) {
            charQuantity = magazineMap.get(c);
            if (charQuantity == null) {
                magazineMap.put(c, 1);
            } else {
                magazineMap.put(c, charQuantity + 1);
            }
        }
        System.out.println(magazineMap);
        for (char c : ransomNoteChars) {
            charQuantity = magazineMap.get(c);
            if (charQuantity == null || charQuantity <= 0) {
                return false;
            } else {
                magazineMap.put(c, charQuantity - 1);
            }
        }
        return true;
    }



//Chatgpt variant

//    public boolean canConstruct(String ransomNote, String magazine) {
//        int[] count = new int[26];
//
//        for (char c : magazine.toCharArray()) {
//            count[c - 'a']++;
//        }
//
//        for (char c : ransomNote.toCharArray()) {
//            count[c - 'a']--;
//
//            if (count[c - 'a'] < 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
