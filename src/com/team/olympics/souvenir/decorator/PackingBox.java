package com.team.olympics.souvenir.decorator;

import com.team.olympics.souvenir.DecoratorComponent;

public class PackingBox extends Decorator {

    public PackingBox() {
        this(null);
    }

    /**
     * Use a packing box to pack the souvenir
     */
    public PackingBox(DecoratorComponent s) {
        super(s);
        System.out.println("The souvenir has been packed.");
    }

    /**
     * Return the cost of the decorated souvenir
     */
    @Override
    public double getPrice() {
        return souvenir.getPrice() + 20;
    }

    /**
     * String representing the description of souvenir
     */
    @Override
    public String getDescription() {
        return souvenir.getDescription();
    }

    @Override
    public String toString() {
        return "class PackingBox extends Decorator";
    }

}
