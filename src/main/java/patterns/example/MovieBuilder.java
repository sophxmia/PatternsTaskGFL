package patterns.example;

public class MovieBuilder {
    private final String title;
    private final Movie.MovieType priceCode;
    private String countryOfOrigin;
    private String shortDescription;
    private String director;
    private String actors;

    public MovieBuilder(String title, Movie.MovieType priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public MovieBuilder setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
        return this;
    }

    public MovieBuilder setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public MovieBuilder setDirector(String director) {
        this.director = director;
        return this;
    }

    public MovieBuilder setActors(String actors) {
        this.actors = actors;
        return this;
    }

    public Movie build(){
        return new Movie(title, priceCode, countryOfOrigin, shortDescription, director, actors);
    }

}
