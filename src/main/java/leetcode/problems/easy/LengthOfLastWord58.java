package leetcode.problems.easy;

public class LengthOfLastWord58 {
    public static void main(String[] args) {
        String words = "   fly me   to   the moon  ";
        String words2 = "fly me   to   the moon  ";
        int length = lengthOfLastWord(words);
        System.out.println("Последнее слово имеет длину " + length);

    }

    public static int lengthOfLastWord(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        char[] chars = reversed.toCharArray();

        // String words = "   fly me   to   the moon  ";
        //"  noom  "

        int length = 0;
        char space = ' ';
        //если чар идет после пробела, то обнуляем;
        boolean afterWord = false;
        for (int i = 0; i < chars.length; i++) {
            //если букву не встречали и на данном указателе буква
            if (chars[i] != space && !afterWord) {
                afterWord = true;
                length++;

                //если была и на данном указателе буква
            } else if (chars[i] != space && afterWord) {
                length++;
            } else if (chars[i] == space && afterWord) {
                break;
            }
        }
        return length;
    }

    // Решение чата гпт.
    public static int lengthOfLastWord2(String s) {
        int length = 0;
        int i = s.length() - 1;

        // пропускаем пробелы в конце
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // считаем буквы последнего слова
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

}
