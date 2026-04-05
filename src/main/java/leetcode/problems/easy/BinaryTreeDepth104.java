package leetcode.problems.easy;

import leetcode.prepare.TreeNode;

public class BinaryTreeDepth104 {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.buildSampleTree();
        int solution = maxDepth2(treeNode);
        System.out.println(solution);
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            System.out.println("Базовый случай");
            return 0;
        } else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            if (left > right) {
                System.out.println("left больше "+ left);
                return left + 1;
            } else {
                System.out.println("right больше "+ right);
                return right + 1;
            }
        }
    }

    public static int maxDepth2(TreeNode root) {
        return maxDepthWithLogging(root, 0);
    }

    private static int maxDepthWithLogging(TreeNode root, int level) {
        String indent = "  ".repeat(level);

        if (root == null) {
            System.out.println(indent + "→ null, return 0");
            return 0;
        }

        System.out.println(indent + "Вошли в узел " + root.val);

        int left = maxDepthWithLogging(root.left, level + 1);
        int right = maxDepthWithLogging(root.right, level + 1);
        int result = 1 + Math.max(left, right);

        System.out.println(indent + "Узел " + root.val +
                " | left=" + left + " right=" + right + " → return " + result);

        return result;
    }
}
