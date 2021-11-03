package com.team.olympics.souvenir.decorator;

import com.team.olympics.souvenir.DecoratorComponent;

public class WordPrinting extends Decorator {

    public WordPrinting() {
        this(null);
    }

    /**
     * Add certain word printing to the souvenir
     */
    public WordPrinting(DecoratorComponent s) {
        super(s);
        System.out.println("Choose to add a word printing");
    }

    /**
     * Return the cost of the decorated souvenir
     */
    @Override
    public double getPrice() {
        return souvenir.getPrice() + 35;
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
        return "class WordPrinting extends Decorator";
    }

}
