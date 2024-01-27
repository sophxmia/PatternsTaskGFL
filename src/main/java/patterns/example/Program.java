package patterns.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Movie> movies = new ArrayList<>();
    private ProgramState currentState;

    public Program() {
        currentState = new AddMovieState(movies);
    }

    public void run() {
        while (true) {
            currentState.displayMenu();
            currentState.executeSelectedOption();

            currentState = new AddMovieState(movies);
        }
    }

    public static void main(String[] args) {
        Program program = new Program();
        program.run();
    }
}
