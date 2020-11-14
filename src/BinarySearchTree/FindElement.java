package BinarySearchTree;

public class FindElement
{
    private NodeClass root;

    public FindElement(NodeClass root)
    {
        this.root = root;
    }

    public NodeClass findMinimum()
    {
        return findMinimumNode(root);
    }
    private NodeClass findMinimumNode(NodeClass root)
    {
        if(root.getLeftBranch() == null)  return root;
        else return findMinimumNode(root.getLeftBranch());
    }

}
