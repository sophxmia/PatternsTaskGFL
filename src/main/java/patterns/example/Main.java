package patterns.example;

import java.util.List;

import static patterns.example.Movie.MovieType.*;


public class Main {

    public static void main(String[] args) {
        Movie movie1 = new MovieBuilder("Rambo", REGULAR).build();
        Movie movie2 = new MovieBuilder("Lord of the Rings", NEW_RELEASE).build();
        Movie movie3 = new MovieBuilder("Harry Potter", CHILDRENS).build();

        List<Rental> rentals = List.of(new Rental(movie1, 1),
                new Rental(movie2, 4),
                new Rental(movie3, 5));

        Customer customer = new Customer("John Doe", rentals);
        String statement = customer.statement();

        System.out.println(statement);
    }
}