package patterns.example;

import java.util.List;
import java.util.Scanner;

public class Program {
    private final Scanner scanner = new Scanner(System.in);
    private final MovieCatalog movieCatalog = new MovieCatalog();

    public Program() {
        Client client1 = new Client("Client 1");
        Client client2 = new Client("Client 2");

        movieCatalog.addObservers(client1);
        movieCatalog.addObservers(client2);
    }

    public void run() {
        while (true) {
            displayMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    removeMovie();
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }

    private void displayMenu() {
        System.out.println("Welcome to the menu");
        System.out.println("What is your choice for today?");
        System.out.println("1. Add Movie");
        System.out.println("2. Search Movie");
    }

    private void addMovie() {
        System.out.println("Enter movie title: ");
        String title = scanner.next();

        Movie movie = new MovieBuilder(title, Movie.MovieType.REGULAR)
                .setCountryOfOrigin("Country")
                .setShortDescription("Description")
                .setDirector("Director")
                .setActors("Actor1, Actor2")
                .build();

        movieCatalog.addMovie(movie);
    }

    private void removeMovie() {
        System.out.println("Enter movie title to remove: ");
        String title = scanner.next();

        List<Movie> movies = movieCatalog.getMovies();
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                movieCatalog.removeMovie(movie);
                return;
            }
        }
        System.out.println("Movie wasn't found");
    }

    public static void main(String[] args) {
        Program program = new Program();
        program.run();
    }
}
