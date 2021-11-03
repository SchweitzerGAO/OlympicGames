package com.team.olympics.souvenir.decorator;

import com.team.olympics.souvenir.DecoratorComponent;

public class PatternPrinting extends Decorator {

    public PatternPrinting() {
        this(null);
    }

    /**
     * Add certain pattern printing to the souvenir
     */
    public PatternPrinting(DecoratorComponent s) {
        super(s);
        System.out.println("Choose to add a pattern printing");
    }

    /**
     * Return the cost of the decorated souvenir
     */
    @Override
    public double getPrice() {
        return souvenir.getPrice() + 50;
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
        return "class PatternPrinting extends Decorator";
    }

}
