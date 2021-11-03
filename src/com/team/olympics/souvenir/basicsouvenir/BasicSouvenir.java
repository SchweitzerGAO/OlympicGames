package com.team.olympics.souvenir.basicsouvenir;

import com.team.olympics.souvenir.DecoratorComponent;

public abstract class BasicSouvenir implements DecoratorComponent {

    protected double price;

    public BasicSouvenir(double price) {
        this.price = price;
    }

    public BasicSouvenir() {
        this(0.0);
    }

    /**
     * String representing the description of the residence
     */
    public abstract String getDescription();

    /**
     * @return price of this souvenir
     */
    public double getPrice() {
        return this.price;
    }

    @Override
    public abstract String toString();

}
