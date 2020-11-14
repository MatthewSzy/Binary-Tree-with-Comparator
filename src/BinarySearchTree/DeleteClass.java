package BinarySearchTree;

import Resources.MovieClass;

import java.util.Comparator;

public class DeleteClass
{
    private Comparator comparator;

    public DeleteClass(Comparator type)
    {
        this.comparator = type;
    }

    public NodeClass remove(NodeClass root, MovieClass key) { return removeNode(root, key); }
    private NodeClass removeNode(NodeClass root, MovieClass key)
    {
        if(root == null) return null;
        if(comparator == null)
        {
            if(key.compareTo(root.getKey()) < 0) root.setLeftBranch(removeNode(root.getLeftBranch(), key));
            else if(key.compareTo(root.getKey()) > 0) root.setRightBranch(removeNode(root.getRightBranch(), key));
            else if(key.getTitle().equals(root.getKey().getTitle()))
            {
                if(root.getLeftBranch() != null && root.getRightBranch() != null)
                {
                    FindElement find = new FindElement(root.getRightBranch());
                    NodeClass minimumRight = find.findMinimum();
                    root.setKey(minimumRight.getKey());
                    root.setRightBranch(removeNode(root.getRightBranch(), minimumRight.getKey()));
                }
                else if(root.getLeftBranch() != null) root = root.getLeftBranch();
                else if(root.getRightBranch() != null) root = root.getRightBranch();
                else root = null;
            }
        }
        else
        {

            if(comparator.compare(key, root.getKey()) < 0) root.setLeftBranch(removeNode(root.getLeftBranch(), key));
            else if(comparator.compare(key, root.getKey()) > 0) root.setRightBranch(removeNode(root.getRightBranch(), key));
            else if(key.getTitle().equals(root.getKey().getTitle()))
            {
                if(root.getLeftBranch() != null && root.getRightBranch() != null)
                {
                    FindElement find = new FindElement(root.getRightBranch());
                    NodeClass minimumRight = find.findMinimum();
                    root.setKey(minimumRight.getKey());
                    root.setRightBranch(removeNode(root.getRightBranch(), minimumRight.getKey()));
                }
                else if(root.getLeftBranch() != null) root = root.getLeftBranch();
                else if(root.getRightBranch() != null) root = root.getRightBranch();
                else root = null;
            }
        }

        return root;
    }
}
