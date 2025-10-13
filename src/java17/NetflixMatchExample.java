package src.java17;

import java.util.Arrays;
import java.util.List;

public class NetflixMatchExample
{
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Incecption", 8.8f, true),
                new Movie("The Dark Knight", 8.7f, true),
                new Movie("Interstellar", 9.0f, true),
                new Movie("HelloMan", 9.5f, false)
        );
        boolean anyBlockBuster = movies.stream().anyMatch(m -> m.getRating() > 9.0);

        if(anyBlockBuster)
        {

        }
    }
}
