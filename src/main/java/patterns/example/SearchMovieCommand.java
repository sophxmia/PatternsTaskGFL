package patterns.example;

import java.util.List;

public class SearchMovieCommand implements Command{
    private final List<Movie> movies;

    public SearchMovieCommand(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public void execute() {
        System.out.println("Searching for movies...");
    }
}
