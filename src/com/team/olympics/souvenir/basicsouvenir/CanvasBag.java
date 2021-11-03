package com.team.olympics.souvenir.basicsouvenir;

import com.team.olympics.souvenir.DecoratorComponent;

public class CanvasBag extends BasicSouvenir {

    /**
     * Show a chosen canvas bag
     */
    public CanvasBag() {
        super(40);
        System.out.println("A canvas bag has been chosen.");
    }

    public CanvasBag(double price) {
        super(price);
    }

    /**
     * String representing the description of the canvas bag
     */
    @Override
    public String getDescription() {
        return "A canvas bag";
    }

    /**
     * Return the price
     */
    @Override
    public double getPrice() {
        return 40;
    }

    @Override
    public String toString() {
        return "class CanvasBag extends BasicSouvenir";
    }

}
