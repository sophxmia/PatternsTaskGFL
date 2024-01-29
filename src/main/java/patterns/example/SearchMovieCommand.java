package patterns.example;

import java.util.List;
import java.util.stream.Collectors;

public class SearchMovieCommand implements Command {
    private final List<Movie> movies;
    private final String searchQuery;

    public SearchMovieCommand(List<Movie> movies, String searchQuery) {
        this.movies = movies;
        this.searchQuery = searchQuery;
    }

    @Override
    public void execute() {
        System.out.println("Searching for movies with criteria: " + searchQuery);

        List<Movie> searchResults = performSearch();

        if (searchResults.isEmpty()) {
            System.out.println("No movies were fount matching the criteria.");
        } else {
            System.out.println("Searching results: ");
            for (Movie movie : searchResults) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Price code: " + movie.getPriceCode());
                System.out.println("Country of Origin: " + movie.getCountryOfOrigin());
                System.out.println("Short description: " + movie.getShortDescription());
                System.out.println("Director: " + movie.getDirector());
                System.out.println("Actors: " + movie.getActors());
            }
        }
    }

    private List<Movie> performSearch() {
        return movies.stream()
                .filter(movie -> movie.getTitle().toLowerCase().contains(searchQuery.toLowerCase()))
                .collect(Collectors.toList());
    }
}
