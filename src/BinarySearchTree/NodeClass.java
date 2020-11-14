package BinarySearchTree;

import Resources.MovieClass;

public class NodeClass
{
    private MovieClass key;
    private NodeClass leftBranch;
    private NodeClass rightBranch;

    public NodeClass(MovieClass key)
    {
        this.key = key;
        this.leftBranch = null;
        this.rightBranch = null;
    }

    public MovieClass getKey()
    {
        return this.key;
    }
    public void setKey(MovieClass key) { this.key = key; }

    public NodeClass getLeftBranch()
    {
        return leftBranch;
    }
    public void setLeftBranch(NodeClass key)
    {
        this.leftBranch = key;
    }

    public NodeClass getRightBranch()
    {
        return rightBranch;
    }
    public void setRightBranch(NodeClass key)
    {
        this.rightBranch = key;
    }
}
