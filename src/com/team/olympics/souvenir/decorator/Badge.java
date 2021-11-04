package com.team.olympics.souvenir.decorator;

import com.team.olympics.souvenir.DecoratorComponent;

public class Badge extends Decorator {

    public Badge() {
        this(null);
    }

    /**
     * Add a badge to the souvenir
     */
    public Badge(DecoratorComponent s) {
        super(s);
        System.out.println("A badge has been added");
    }

    /**
     * Return the cost of the decorated souvenir
     */
    @Override
    public double getPrice() {
        return souvenir.getPrice() + 10;
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
        return "class Badge extends Decorator";
    }

}
