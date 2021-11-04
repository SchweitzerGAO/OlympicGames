package com.team.olympics.souvenir.basicsouvenir;

public class Hoodie extends BasicSouvenir {

    /**
     * Show a chosen hoodie
     */
    public Hoodie() {
        super(120);
        System.out.println("A hoodie has been chosen.");
    }

    public Hoodie(double price) {
        super(price);
    }

    /**
     * String representing the description of the hoodie
     */
    @Override
    public String getDescription() {
        return "A hoodie";
    }

    /**
     * Return the price
     */
    @Override
    public double getPrice() {
        return 120;
    }

    @Override
    public String toString() {
        return "class Hoodie extends BasicSouvenir";
    }

}
