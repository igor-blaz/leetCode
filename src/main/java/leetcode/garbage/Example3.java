package leetcode.garbage;

public class Example3 {


        public static String maximize(String a, String b) {
            int[] count = new int[10];

            for (char ch : b.toCharArray()) {
                count[ch - '0']++;
            }

            char[] result = a.toCharArray();

            for (int i = 0; i < result.length; i++) {
                int currentDigit = result[i] - '0';

                for (int d = 9; d > currentDigit; d--) {
                    if (count[d] > 0) {
                        result[i] = (char) ('0' + d);
                        count[d]--;
                        break;
                    }
                }
            }

            return new String(result);
        }

        public static void main(String[] args) {
            System.out.println(maximize("132", "94"));    // 942
            System.out.println(maximize("567", "94"));    // 967
            System.out.println(maximize("909", "11"));    // 919
            System.out.println(maximize("1000", "897"));  // 9870
        }
    }

