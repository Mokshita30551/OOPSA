// MovieReview.java
import java.util.*;
import java.util.function.*;

class Movie {
    private String title;
    private double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() { return title; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return title + " (" + rating + ")";
    }
}

public class MovieReview {
    public static void main(String[] args) {
        // Step 1: Create a list of movies
        List<Movie> movies = Arrays.asList(
            new Movie("Inception", 8.8),
            new Movie("Avatar", 7.3),
            new Movie("The Dark Knight", 9.0),
            new Movie("Interstellar", 8.6),
            new Movie("The Flash", 6.9),
            new Movie("Oppenheimer", 8.7)
        );

        // Step 2: Define Predicate to filter movies with rating > 7.5
        Predicate<Movie> isTopRated = m -> m.getRating() > 7.5;

        // Step 3: Define Consumer to display movie title and rating
        Consumer<Movie> displayMovie = m ->
            System.out.println(m.getTitle() + " - Rating: " + m.getRating());

        // Step 4: Stream processing with lambda expressions
        System.out.println("🎥 Top Rated Movies (Rating > 7.5):");
        movies.stream()
              .filter(isTopRated)
              .forEach(displayMovie);
    }
}
