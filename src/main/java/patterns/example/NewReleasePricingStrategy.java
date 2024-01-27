package patterns.example;

public class NewReleasePricingStrategy implements PricingStrategy{
    @Override
    public double calculateRentalCost(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
