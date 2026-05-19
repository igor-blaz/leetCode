package leetcode.problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1275FindAWinnerOnATicTacToeGame {
    public static void main(String[] args) {
        int[][] moves = {{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}};
        System.out.println(tictactoe(moves));
    }

    public static String tictactoe(int[][] moves) {
        if (moves.length == 9) {
            //Ищем все нечетные
            int[][] aMoves = new int[5][];
            aMoves[0] = moves[0];
            aMoves[1] = moves[2];
            aMoves[2] = moves[4];
            aMoves[3] = moves[6];
            aMoves[4] = moves[8];
            if (isWin(aMoves)) {
                return "A";
            } else {
                return "Draw";
            }
        }

        if (moves.length < 9) {
            List<int[]> currentPlayerMoves = new ArrayList<>();

            int startIndex = moves.length % 2 == 0 ? 1 : 0;

            for (int i = startIndex; i < moves.length; i += 2) {
                currentPlayerMoves.add(moves[i]);
            }

            int[][] currentArray = currentPlayerMoves.toArray(new int[0][]);

            if (isWin(currentArray)) {
                return startIndex == 0 ? "A" : "B";
            }
        }
        return "Pending";
    }

    public static boolean isWin(int[][] moves) {
        boolean maybeDiagonal = false;
        Map<Integer, Integer> horizontal = new HashMap<>(3);
        Map<Integer, Integer> vertical = new HashMap<>(3);
        for (int[] move : moves) {
            int x = move[0];
            int y = move[1];
            if (x == 1 & y == 1) {
                maybeDiagonal = true;
            }
            horizontal.put(x, horizontal.getOrDefault(x, 0) + 1);
            vertical.put(y, vertical.getOrDefault(y, 0) + 1);
        }
        if (horizontal.containsValue(3)) return true;
        if (vertical.containsValue(3)) return true;
        if (!maybeDiagonal) return false;
        if (hasDiagonal(moves)) return true;
        System.out.println("Horizontal " + horizontal);
        System.out.println("Vertical " + vertical);
        return false;
    }

    public static boolean hasDiagonal(int[][] moves) {
        int fallingDiagonal = 0;
        int risingDiagonal = 0;
        for (int[] move : moves) {
            if (move[0] == 0) {
                if (move[1] == 2) {
                    risingDiagonal += 1;
                } else if (move[1] == 0) {
                    fallingDiagonal += 1;
                }
            } else if (move[0] == 2) {
                if (move[1] == 2) {
                    fallingDiagonal += 1;
                } else if (move[1] == 0) {
                    risingDiagonal += 1;
                }
            }
        }
        return risingDiagonal == 2 || fallingDiagonal == 2;
    }
}
