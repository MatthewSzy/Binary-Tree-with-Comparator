package Comparator;

import Resources.*;
import java.util.Comparator;

public class GeneralComparator implements Comparator<MovieClass>
{
    private double rating;
    private String category;
    private int year;

    public GeneralComparator(double rating, String category, int year)
    {
        this.rating = rating;
        this.category = category;
        this.year = year;
    }

    public int compare(MovieClass o1, MovieClass o2)
    {
        CompareClass comp = new CompareClass(this.rating, this.category, this.year);
        int valueOne = comp.calculateGeneralMovie(o1.getRating(), o1.getCategory(), o1.getReleaseDate().getYear()+1900);
        int valueTwo = comp.calculateGeneralMovie(o2.getRating(), o2.getCategory(), o2.getReleaseDate().getYear()+1900);

        int comparison = Integer.compare(valueOne, valueTwo);
        if(comparison == 0) return CharSequence.compare(o1.getTitle(), o2.getTitle());
        else return comparison;
    }
}
