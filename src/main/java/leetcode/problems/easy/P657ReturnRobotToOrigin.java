package leetcode.problems.easy;

public class P657ReturnRobotToOrigin {
    public static void main(String[] args) {
        String moves = "UUDDLLRR";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        char[] movesArr = moves.toCharArray();
        int x = 0;
        int y = 0;
        for (char c : movesArr) {
            if (c == 'U') {
                y += 1;
            }
            if (c == 'D') {
                y -= 1;
            }
            if (c == 'R') {
                x += 1;
            }
            if (c == 'L') {
                x -= 1;
            }
        }
        return x == 0 && y == 0;
    }
}
