package leetcode.problems.easy;

import leetcode.prepare.TreeNode;

public class P101SymmetricTree {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.makeSymmetricTree();
        boolean answer = isSymmetric(treeNode);
        System.out.println(answer);
    }

    public static boolean isSymmetric(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode a, TreeNode b) {
        //Если оба null
        if (a == null && b == null) return true;
        //Если один null, a другой нет
        if (a == null || b == null) return false;
        //Если значения не равны
        if (a.val != b.val) return false;

        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }
}
