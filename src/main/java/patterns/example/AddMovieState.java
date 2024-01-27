package patterns.example;

import java.util.List;
import java.util.Scanner;

public class AddMovieState implements ProgramState {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Movie> movies;

    public AddMovieState(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public void displayMenu() {
        System.out.println("Welcome to the Add Movie");
        System.out.println("Enter movie details:");

        Movie movie = new MovieBuilder("Example Movie", Movie.MovieType.REGULAR)
                .setCountryOfOrigin("Country")
                .setShortDescription("Description")
                .setDirector("Director")
                .setActors("Actor1, Actor2")
                .build();
        movies.add(movie);
        System.out.println("Movie added successfully");
    }

    @Override
    public void executeSelectedOption() {
    }
}
