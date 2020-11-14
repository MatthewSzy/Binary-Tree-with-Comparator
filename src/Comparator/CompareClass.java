package Comparator;

public class CompareClass
{
    private double rating;
    private String category;
    private int year;

    public CompareClass(double rating, String category, int year)
    {
        this.rating = rating;
        this.category = category;
        this.year = year;
    }

    public int calculateGeneralMovie(double rating, String category, int year)
    {
        if(rating >= this.rating && category.equals(this.category) && year >= this.year)
        {
            return 3;
        }
        else if((rating < this.rating && category.equals(this.category) && year >= this.year) ||
                (rating >= this.rating && !category.equals(this.category) && year >= this.year) ||
                (rating >= this.rating && category.equals(this.category) && year < this.year))
        {
            return 2;
        }
        else if((rating >= this.rating && !category.equals(this.category) && year < this.year) ||
                (rating < this.rating && category.equals(this.category) && year < this.year) ||
                (rating < this.rating && !category.equals(this.category) && year >= this.year))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public double calculateTargetMovie(double rating, String category, int year)
    {
        double value = 0;
        if(!category.equals(this.category)) value++;
        value = value + ((Math.abs(this.rating - rating)) * 10);
        value = value + (Math.abs(this.year - year));

        return value;
    }
}
