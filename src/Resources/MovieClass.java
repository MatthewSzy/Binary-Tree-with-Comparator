package Resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MovieClass implements Comparable<MovieClass>
{
    private double rating;
    private String title;
    private String category;
    private Date releaseDate;

    public int compareTo(MovieClass movie)
    {
        if(this.releaseDate.after(movie.releaseDate)) return 1;
        else if(this.releaseDate.before(movie.releaseDate)) return -1;
        return 0;
    }

    public MovieClass(double rating, String title, String category, String releaseDate)
    {
        this.rating = rating;
        this.title = title;
        this.category = category;
        try
        {
            this.releaseDate = new SimpleDateFormat("dd/MM/yyyy").parse(releaseDate);
        }
        catch (ParseException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public double getRating()
    {
        return this.rating;
    }
    public String getTitle()
    {
        return this.title;
    }
    public String getCategory(){ return this.category;}
    public Date getReleaseDate()
    {
        return this.releaseDate;
    }

    public void print()
    {
        printMovie();
    }
    private void printMovie()
    {
        System.out.printf("%-40s %-15s %-15s Rating: %s\n", this.title, this.category, new SimpleDateFormat("dd/MM/yyyy").format(this.releaseDate), this.rating);
    }
}