package patterns.example;

import java.util.List;

public class RegularCustomer extends Customer {

    public RegularCustomer(String name, List<Rental> rentals) {
        super(name, rentals);
    }

    @Override
    protected double calculateRentalCost(Rental rental) {
        return rental.getMovie().calculateRentalCost(rental.getDaysRented());
    }

    @Override
    protected int calculateFrequentRenterPoints(Rental rental) {
        return rental.getMovie().calculateFrequentRenterPoints(rental.getDaysRented());
    }
}
