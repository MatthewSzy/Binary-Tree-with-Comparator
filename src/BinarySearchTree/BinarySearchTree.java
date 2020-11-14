package BinarySearchTree;

import Resources.*;
import Comparator.*;

import java.util.Comparator;
import java.util.List;

public class BinarySearchTree
{
    private NodeClass root;
    private Comparator comparator;

    public BinarySearchTree()
    {
        this.root = null;
        this.comparator = null;
    }

    public BinarySearchTree(double rating, String category, int year, ComparatorType.type type)
    {
        this.root = null;
        if(type.equals(ComparatorType.type.GENERAL)) this.comparator = new GeneralComparator(rating, category, year);
        else if(type.equals(ComparatorType.type.TARGET)) this.comparator = new TargetComparator(rating, category, year);
    }

    public void insert(MovieClass key) { root = insertNode(root, key); }
    private NodeClass insertNode(NodeClass root, MovieClass key)
    {
        InsertClass insert = new InsertClass(comparator);
        return insert.add(root, key);
    }

    public void delete(MovieClass key) { root = deleteNode(root, key); }
    private NodeClass deleteNode(NodeClass root, MovieClass key)
    {
        DeleteClass deleteKey = new DeleteClass(comparator);
        return deleteKey.remove(root, key);
    }

    public void insertAll(List<MovieClass> list) { insertList(list); }
    private void insertList(List<MovieClass> list)
    {
        for(MovieClass x : list) insert(x);
    }

    public void print() { printNode(root); }
    private void printNode(NodeClass root)
    {
        if(root != null)
        {
            printNode(root.getLeftBranch());
            root.getKey().print();
            printNode(root.getRightBranch());
        }
    }

    public void generate() { generateBST(); }
    private void generateBST()
    {
        GenerateList list = new GenerateList();
        insertAll(list.generateList());
    }
}