package patterns.example;

import java.util.List;
import java.util.Scanner;

public class SearchMovieState implements ProgramState{
    private final Scanner scanner = new Scanner(System.in);
    private final List<Movie> movies;

    public SearchMovieState(List<Movie> movies) {
        this.movies = movies;
    }
    @Override
    public void displayMenu() {
        System.out.println("Welcome to Search Movie");
        System.out.println("Enter search criteria:");
    }
    @Override
    public void executeSelectedOption() {}
}
