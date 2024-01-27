package patterns.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Movie> movies = new ArrayList<>();
    private final ProgramInvoker invoker = new ProgramInvoker();

    public Program() {
        invoker.setCommand(new AddMovieCommand(movies));
    }

    public void run() {
        while (true) {
            displayMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    invoker.setCommand(new AddMovieCommand(movies));
                    break;
                case 2:
                    invoker.setCommand(new SearchMovieCommand(movies));
                    break;
                default:
                    System.out.println("Invalid command");
            }
            invoker.executeCommand();
        }
    }

    private void displayMenu() {
        System.out.println("Welcome to the menu");
        System.out.println("What is your choice for today?");
        System.out.println("1. Add Movie");
        System.out.println("2. Search Movie");
    }

    public static void main(String[] args) {
        Program program = new Program();
        program.run();
    }
}
