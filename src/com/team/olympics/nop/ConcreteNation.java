package com.team.olympics.nop;

public class ConcreteNation extends Nation{
    public ConcreteNation(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
