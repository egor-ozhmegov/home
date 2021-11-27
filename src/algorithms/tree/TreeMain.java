package algorithms.tree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class TreeMain {

    private static TreeNode tree = new TreeNode(20,
            new TreeNode(7,
                    new TreeNode(4,
                            null, new TreeNode(6,
                            null, null)),
                    new TreeNode(9,
                            null, null)),
            new TreeNode(35,
                    new TreeNode(31,
                            new TreeNode(28,
                                    null, null), null),
                    new TreeNode(40,
                            new TreeNode(38,
                                    null, null),
                            new TreeNode(52,
                                    null, null))));

    public static void main(String[] args) {
        System.out.println("Found value by depth first search: " + depthFirstSearch(tree, 52));
        System.out.println("Found value by breadth first search: " + breadthFirstSearch(tree, 52));
        printTreeDescOrder(tree);
    }

    public static TreeNode depthFirstSearch(TreeNode tree, int value) {
        //TODO
        return null;
    }

    public static TreeNode breadthFirstSearch(TreeNode tree, int value) {
        //TODO
        return null;
    }

    public static void printTreeDescOrder(TreeNode treeNode) {
        //TODO
    }
}
