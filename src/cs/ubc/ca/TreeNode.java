package cs.ubc.ca;

import java.util.ArrayList;
import java.util.Iterator;

public class TreeNode implements Iterable<TreeNode>{
    private String name;
    private int value;
    private TreeNode parent;
    private ArrayList<TreeNode> children;
    private int level;

    public TreeNode(String name, int value, TreeNode parent, int level) {
        this.name = name;
        this.value = value;
        this.parent = parent;
        children = new ArrayList<>();
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public int getValue() {
        return value;
    }

    public boolean hasChildren() {
        return !children.isEmpty();
    }

    public void addChild(String name, int value) {
        TreeNode child = new TreeNode(name, value, this, level + 1);
        children.add(child);
    }

    public int getLevel() {
        return level;
    }

    public ArrayList<TreeNode> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return name + "=" + value;
    }

    @Override
    public Iterator<TreeNode> iterator() {
        return children.iterator();
    }

}
