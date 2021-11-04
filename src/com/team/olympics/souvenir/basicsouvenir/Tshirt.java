package com.team.olympics.souvenir.basicsouvenir;

public class Tshirt extends BasicSouvenir {

    /**
     * Show a chosen T-shirt
     */
    public Tshirt() {
        super(100);
        System.out.println("A T-shirt has been chosen.");
    }

    public Tshirt(double price) {
        super(price);
    }

    /**
     * String representing the description of the T-shirt
     */
    @Override
    public String getDescription() {
        return "A T-shirt";
    }

    /**
     * Return the price
     */
    @Override
    public double getPrice() {
        return 100;
    }

    @Override
    public String toString() {
        return "class Tshirt extends BasicSouvenir";
    }

}
