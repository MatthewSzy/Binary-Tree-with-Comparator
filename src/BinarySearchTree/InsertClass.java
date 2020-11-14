package BinarySearchTree;

import Resources.MovieClass;

import java.util.Comparator;

public class InsertClass
{
    private Comparator comparator;

    public InsertClass(Comparator type)
    {
        this.comparator = type;
    }

    public NodeClass add(NodeClass root, MovieClass key) { return addNode(root, key); }
    private NodeClass addNode(NodeClass root, MovieClass key)
    {
        if(root == null) return root = new NodeClass(key);
        int comparison = (comparator == null) ? key.compareTo(root.getKey()) : comparator.compare(key, root.getKey());
        if(comparison < 0) root.setLeftBranch(add(root.getLeftBranch(), key));
        else root.setRightBranch(add(root.getRightBranch(), key));

        return root;
    }
}
