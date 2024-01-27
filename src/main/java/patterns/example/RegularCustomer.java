package patterns.example;

import java.util.List;

public class RegularCustomer extends Customer {

    public RegularCustomer(String name, List<Rental> rentals) {
        super(name, rentals);
    }

    @Override
    protected double calculateRentalCost(Rental rental) {
        return 0.0;
    }

    @Override
    protected int calculateFrequentRenterPoints(Rental rental) {
        return 0;
    }
}
