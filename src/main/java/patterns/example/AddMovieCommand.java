package patterns.example;

import java.util.List;

public class AddMovieCommand implements Command {
    private final List<Movie> movies;

    public AddMovieCommand(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public void execute() {
        Movie movie = new MovieBuilder("Example Movie", Movie.MovieType.REGULAR)
                .setCountryOfOrigin("Country")
                .setShortDescription("Description")
                .setDirector("Director")
                .setActors("Actor1, Actor2")
                .build();

        movies.add(movie);
        System.out.println("Movie added successfully");
    }
}
