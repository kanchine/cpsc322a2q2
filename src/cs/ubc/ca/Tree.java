package cs.ubc.ca;

import java.util.HashMap;
import java.util.Map;

public class Tree {
    private TreeNode root;

    public Tree(String[] variables, int[] domain, Constrains constrains) {
        root = new TreeNode("root", -1, null, 0);
        buildTreeNode(variables, domain, 0, root, constrains);
    }

    public TreeNode getRoot() {
        return root;
    }


    private void buildTreeNode(String[] variables, int[] domain, int index, TreeNode parent, Constrains constrains) {
        if(index >= variables.length)
            return;

        for(int d : domain) {

            // We are not going to add leave node variables if they break any of the conditions.
            if(index == variables.length - 1) {
                Map<String, Integer> branchRes = getBranchRes(parent);
                branchRes.put(variables[index], d);

                if(constrains.satisfyAll(branchRes))
                    parent.addChild(variables[index], d);
            }
            else
                parent.addChild(variables[index], d);
        }

        for(TreeNode n : parent) {
            Map<String, Integer> branchRes = getBranchRes(n);

            if(constrains.satisfyAll(branchRes))
                buildTreeNode(variables, domain, index + 1, n, constrains);
        }
    }

    private Map<String, Integer> getBranchRes(TreeNode node) {
        HashMap<String, Integer> res = new HashMap<>();
        TreeNode curr = node;
        while(curr.getName() != "root"){
            res.put(curr.getName(), curr.getValue());
            curr = curr.getParent();
        }

        return res;
    }
}
