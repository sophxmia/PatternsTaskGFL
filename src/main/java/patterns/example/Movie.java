package patterns.example;

public class Movie {
    private final String title;
    private final MovieType priceCode;
    private final String countryOfOrigin;
    private final String shortDescription;
    private final String director;
    private final String actors;

    private final PricingStrategy pricingStrategy;

    public enum MovieType {
        REGULAR, NEW_RELEASE, CHILDRENS
    }

    public Movie(String title, MovieType priceCode, String countryOfOrigin, String shortDescription, String director, String actors) {
        this.title = title;
        this.priceCode = priceCode;
        this.countryOfOrigin = countryOfOrigin;
        this.shortDescription = shortDescription;
        this.director = director;
        this.actors = actors;
        this.pricingStrategy = createPricingStrategy(priceCode);
    }

    private PricingStrategy createPricingStrategy(MovieType priceCode) {
        switch (priceCode) {
            case REGULAR -> {
                return new RegularPricingStrategy();
            }
            case NEW_RELEASE -> {
                return new NewReleasePricingStrategy();
            }
            case CHILDRENS -> {
                return new ChildrensPricingStrategy();
            }
            default -> throw new IllegalArgumentException("Unknown price code");
        }
    }

    public MovieType getPriceCode() {
        return priceCode;
    }

    public String getTitle() {
        return title;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
        return actors;
    }

    public double calculateRentalCost(int daysRented) {
        return pricingStrategy.calculateRentalCost(daysRented);
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return pricingStrategy.calculateFrequentRenterPoints(daysRented);
    }
}