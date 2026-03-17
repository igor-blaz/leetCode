package leetcode.problems.easy;

public class P242ValidAnagram {
    public static void main(String[] args) {
        String s = "ggii";
        String s2 = "eekk";
        System.out.println(isAnagram(s, s2));
    }

//    public static boolean isAnagram(String s, String t) {
//        char[] sArray = s.toCharArray();
//        List<Integer> sIntegers = new ArrayList<>();
//        List<Integer> tIntegers = new ArrayList<>();
//
//        char[] tArray = t.toCharArray();
//        for (char c : sArray) {
//            sIntegers.add((int)c);
//        }
//        for (char c : tArray) {
//            tIntegers.add((int)c);
//        }
//        sIntegers.sort(Integer::compareTo);
//        tIntegers.sort(Integer::compareTo);
//        return sIntegers.equals(tIntegers);
//    }

    public static boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int[] count = new int[26];
        for (char c : sArray) {
            int cInteger = c - 'a';
            count[cInteger]++;
        }
        for (char c : tArray) {
            int cInteger = c - 'a';
            count[cInteger]--;
        }
        for (int i : count) {
            if (i != 0) return false;
        }
        return true;
    }
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//
//        int[] count = new int[26];
//
//        for (int i = 0; i < s.length(); i++) {
//            count[s.charAt(i) - 'a']++;
//            count[t.charAt(i) - 'a']--;
//        }
//
//        for (int c : count) {
//            if (c != 0) return false;
//        }
//
//        return true;
//    }
}
