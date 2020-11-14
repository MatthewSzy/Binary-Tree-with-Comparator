import BinarySearchTree.*;
import Resources.MovieClass;

public class Main
{
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree(7.8, "Sci-Fi", 2002, ComparatorType.type.TARGET);
        tree.generate();
        //tree.delete(new MovieClass(8.2,"Inception", "Sci-Fi", "08/07/2010"));
        //tree.delete(new MovieClass(8.1,"Avengers: Infinity War", "Sci-Fi", "23/04/2018"));
        tree.print();
    }
}