package leetcode.problems.easy;

import leetcode.prepare.TreeNode;

public class P112PathSum {
    public static void main(String[] args) {
        int targetSum = 22;
        TreeNode treeNode = TreeNode.buildExampleTree();
        boolean bool = hasPathSum(treeNode, targetSum);
        System.out.println("Ответ " + bool);
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.val == targetSum &&
                root.left == null &&
                root.right == null) {
            return true;
        } else if (targetSum > 0 &&
                root.left == null &&
                root.right == null) {
            return false;
        } else {
            targetSum = targetSum - root.val;
            boolean right = hasPathSum(root.right, targetSum);
            boolean left = hasPathSum(root.left, targetSum);
            return right || left;
        }
    }
//ChatGPT
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if (root == null) return false;
//
//        // если лист — проверяем ровно совпадение
//        if (root.left == null && root.right == null) {
//            return root.val == targetSum;
//        }
//
//        int rest = targetSum - root.val;
//        return hasPathSum(root.left, rest) || hasPathSum(root.right, rest);
//    }

}
