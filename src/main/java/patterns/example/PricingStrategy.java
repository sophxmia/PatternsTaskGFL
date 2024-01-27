package patterns.example;

public interface PricingStrategy {
    double calculateRentalCost(int daysRented);
    int calculateFrequentRenterPoints(int daysRented);
}
