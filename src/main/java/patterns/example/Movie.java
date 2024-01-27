package patterns.example;

public class Movie {
    private final String title;
    private final MovieType priceCode;
    private String countryOfOrigin;
    private String shortDescription;
    private String director;
    private String actors;

    public enum MovieType {
        REGULAR, NEW_RELEASE, CHILDRENS
    }

    public Movie(String title, MovieType priceCode, String countryOfOrigin, String shortDescription, String director, String actors) {
        this.title = title;
        this.priceCode = priceCode;
        this.countryOfOrigin = countryOfOrigin;
        this.shortDescription =shortDescription;
        this.director = director;
        this.actors = actors;
    }

    public MovieType getPriceCode() {
        return priceCode;
    }

    public String getTitle() {
        return title;
    }

}