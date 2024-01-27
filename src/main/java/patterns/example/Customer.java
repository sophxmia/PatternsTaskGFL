package patterns.example;

import java.util.List;

public abstract class Customer {
    private final String name;
    private final List<Rental> rentals;

    public Customer(String name, List<Rental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder("Rental Record for ").append(getName()).append("\n");

        for (Rental each : rentals) {
            double thisAmount = calculateRentalCost(each);
            frequentRenterPoints += calculateFrequentRenterPoints(each);
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append(thisAmount).append("\n");
            totalAmount += thisAmount;
        }

        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");

        return result.toString();
    }

    protected abstract double calculateRentalCost(Rental rental);

    protected abstract int calculateFrequentRenterPoints(Rental rental);

    public String getName() {
        return name;
    }
}