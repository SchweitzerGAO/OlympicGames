package com.team.olympics.souvenir.basicsouvenir;

public class Cap extends BasicSouvenir {

    /**
     * Show a chosen cap
     */
    public Cap() {
        super(50);
        System.out.println("A cap has been chosen.");
    }

    public Cap(double price) {
        super(price);
    }

    /**
     * String representing the description of the canvas bag
     */
    @Override
    public String getDescription() {
        return "A cap";
    }

    /**
     * Return the price
     */
    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public String toString() {
        return "class Cap extends BasicSouvenir";
    }

}
