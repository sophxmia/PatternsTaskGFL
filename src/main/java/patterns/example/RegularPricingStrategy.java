package patterns.example;

public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculateRentalCost(int daysRented) {
        double cost = 2;
        if (daysRented > 2) {
            cost += (daysRented - 2) * 1.5;
        }
        return cost;
    }

    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
