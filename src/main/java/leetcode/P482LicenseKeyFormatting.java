package leetcode;

import java.util.Arrays;

public class P482LicenseKeyFormatting {
    public static void main(String[] args) {
        int k = 2;
        String s = "2";
        System.out.println(licenseKeyFormatting(s, k));

    }

    public static String licenseKeyFormatting(String s, int k) {
        if(k > s.length()){
            return "";
        }
        if(k == s.length()){
            return s;
        }

        String key = s.toUpperCase().replace("-", "");
        System.out.println(key.length());
        System.out.println(key);
        int copy = key.length();

        while (copy % k != 0) {
            copy--;
        }
        int firstChunkLength = key.length() - copy;
        String nextChunks = key.substring(firstChunkLength);
        System.out.println("next " + nextChunks);
        System.out.println("first " + firstChunkLength);
        StringBuilder stringBuilder = new StringBuilder();
        if (firstChunkLength != 0) {
            String firstChunk = key.substring(0, firstChunkLength);
            stringBuilder.append(firstChunk);
            stringBuilder.append("-");
        }

        char[] chars = nextChunks.toCharArray();
        int i = 0;
        for (char c : chars) {
            if (i == k) {
                stringBuilder.append("-");
                i = 0;
            }
            stringBuilder.append(c);
            i++;
        }

        return stringBuilder.toString();
    }
}
