package leetcode.prepare;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode buildSampleTree() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2, node4, null);
        TreeNode node3 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1, node2, node3);

        return node1; // корень дерева
    }

    // 1) публичный метод-заготовка
    public static TreeNode buildRandomTree() {
        int maxDepth = 4;          // <- попробуй 4..6
        double pCreate = 0.85;     // <- шанс создать узел на верхних уровнях
        return buildRandomTree(1, maxDepth, pCreate);
    }

    // 2) рекурсивный генератор
    private static TreeNode buildRandomTree(int depth, int maxDepth, double pCreate) {
        // стоп: глубина
        if (depth > maxDepth) return null;

        // стоп: случайно "обрываем" ветку
        // (на глубине шанс уменьшаем, чтобы дерево естественно "заканчивалось")
        double pHere = pCreate * Math.pow(0.75, depth - 1);
        if (Math.random() > pHere) return null;

        int val = RandomVariables.getRandomInteger(-100, 100);
        TreeNode node = new TreeNode(val);

        node.left = buildRandomTree(depth + 1, maxDepth, pCreate);
        node.right = buildRandomTree(depth + 1, maxDepth, pCreate);

        return node;
    }

    public static TreeNode makeSymmetricTree() {
        TreeNode left = new TreeNode(2,
                new TreeNode(3),
                new TreeNode(4)
        );

        TreeNode right = new TreeNode(2,
                new TreeNode(4),
                new TreeNode(3)
        );

        return new TreeNode(1, left, right);
    }
    public static TreeNode buildExampleTree() {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        return root;
    }

}
