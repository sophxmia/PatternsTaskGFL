package patterns.example;

public class ChildrensPricingStrategy implements PricingStrategy {
    @Override
    public double calculateRentalCost(int daysRented) {
        double cost = 1.5;
        if (daysRented > 3) {
            cost += (daysRented - 3) * 1.5;
        }
        return cost;
    }

    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
