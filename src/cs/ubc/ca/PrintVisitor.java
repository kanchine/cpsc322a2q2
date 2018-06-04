package cs.ubc.ca;

import java.util.ArrayList;

public class PrintVisitor {

    public static void printTree(Tree t, String[] variables) {
        TreeNode root = t.getRoot();

        for(TreeNode n : root) {
            printNode(n, variables);
        }
    }

    private static boolean printNode(TreeNode node, String[] variables) {
        System.out.print(node + " ");

        if(!node.hasChildren()) {
            if (node.getName() == variables[variables.length - 1])
                System.out.println("solution");
            else
                System.out.println("failure");

            return true;
        }

        ArrayList<TreeNode> children = node.getChildren();

        for(int idx = 0; idx < children.size(); ++idx) {
            TreeNode n = children.get(idx);
            boolean newLine = printNode(n, variables);

            if(newLine) {
                if(idx < children.size() - 1) {
                    int lvl = node.getLevel();
                    StringBuilder sb = new StringBuilder();
                    for (int jdx = 0; jdx < lvl; ++jdx)
                        sb.append("    ");

                    System.out.print(sb);
                }
                else
                    return true;
            }
        }

        return false;
    }
}
