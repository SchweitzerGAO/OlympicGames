package com.team.olympics.souvenir.decorator;

import com.team.olympics.souvenir.DecoratorComponent;

public abstract class Decorator implements DecoratorComponent {     //this represents the decoration of souvenir

    /**
     * Souvenirs decorated by the Decorator
     */
    protected DecoratorComponent souvenir;

    public Decorator() {
        this(null);
    }

    /**
     * Represents the decorated residence
     */
    public Decorator(DecoratorComponent s) {
        souvenir = s;
    }

    @Override
    public String toString() {
        return "abstract class ResidenceDecorator extends Residence";
    }

}
