package BinarySearchTree;

import Resources.MovieClass;

import java.util.ArrayList;

public class GenerateList
{
    public GenerateList(){};
    
    public ArrayList<MovieClass> generateList()
    {
        return generate();
    }
    private ArrayList<MovieClass> generate()
    {
        ArrayList<MovieClass> exampleList = new ArrayList<MovieClass>();

        exampleList.add(new MovieClass(8.1,"Whiplash", "Drama", "16/01/2014"));
        exampleList.add(new MovieClass(8.2,"Shutter Island", "Thriller", "13/02/2010"));
        exampleList.add(new MovieClass(8.1,"Spider-Man: Into the Spider-Verse", "Animation", "07/12/2018"));
        exampleList.add(new MovieClass(7.9,"Enemy at the Gates","War", "7/02/2001"));
        exampleList.add(new MovieClass(8.3,"Se7en", "Thriller", "15/09/1995"));
        exampleList.add(new MovieClass(7.7,"The Dark Knight Rises", "Action","16/07/2012"));
        exampleList.add(new MovieClass(7.8,"Jojo Rabbit", "Comedy","08/09/2019"));
        exampleList.add(new MovieClass(8.1,"Avengers: Infinity War", "Sci-Fi", "23/04/2018"));
        exampleList.add(new MovieClass(8.7,"The Intouchables", "Drama", "23/09/2011"));
        exampleList.add(new MovieClass(8.6,"The Green Mile", "Drama", "06/12/1999"));
        exampleList.add(new MovieClass(8.3,"Joker", "Drama", "31/08/2019"));
        exampleList.add(new MovieClass(8.4,"Schindler's List", "Drama", "30/11/1993"));
        exampleList.add(new MovieClass(8.0,"The Dark Knight", "Action","14/07/2008"));
        exampleList.add(new MovieClass(8.2,"Inception", "Sci-Fi", "08/07/2010"));
        exampleList.add(new MovieClass(7.9,"Bogowie", "Biographical","18/09/2014"));
        exampleList.add(new MovieClass(8.5,"Forrest Gump", "Comedy", "23/06/1994"));
        exampleList.add(new MovieClass(8.6,"The Godfather", "Gangster", "15/03/1972"));
        exampleList.add(new MovieClass(8.3,"Pulp Fiction", "Gangster", "12/05/1994"));
        exampleList.add(new MovieClass(7.9,"Taxi Driver", "Drama", "07/02/1976"));
        exampleList.add(new MovieClass(7.5,"Star Wars: Revenge of the Sith", "Sci-Fi", "12/05/2005"));
        exampleList.add(new MovieClass(7.6,"Knives Out", "Comedy", "07/09/2019"));
        exampleList.add(new MovieClass(7.5,"Ice Age", "Animation", "12/03/2002"));
        exampleList.add(new MovieClass(7.5,"Terminator 2: Judgment Day", "Action", "01/07/1991"));
        exampleList.add(new MovieClass(7.2,"Blade Runner 2049", "Sci-Fi", "03/10/2017"));
        exampleList.add(new MovieClass(7.4,"Guardians of the Galaxy", "Action", "21/07/2014"));
        exampleList.add(new MovieClass(7.3,"Toy Story", "Animation", "19/11/1995"));
        exampleList.add(new MovieClass(8.2,"The Lion King", "Animation", "15/06/1994"));
        exampleList.add(new MovieClass(7.7,"The Wolf of Wall Street", "Biographical", "17/12/2013"));
        exampleList.add(new MovieClass(7.6,"The Last Samurai", "Drama", "22/11/2003"));
        exampleList.add(new MovieClass(7.1,"American Sniper", "Biographical", "11/11/2014"));

        return exampleList;
    }
}
