package src.java17;

import java.util.Objects;

public class Movie
{
    private String title;
    private float rating;
    private boolean adAvailable;

    public Movie(String title, float rating, boolean adAvailable) {
        this.title = title;
        this.rating = rating;
        this.adAvailable = adAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public boolean isAdAvailable() {
        return adAvailable;
    }

    public void setAdAvailable(boolean adAvailable) {
        this.adAvailable = adAvailable;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Movie movie = (Movie) object;
        return Float.compare(rating, movie.rating) == 0 && adAvailable == movie.adAvailable && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, rating, adAvailable);
    }
}
