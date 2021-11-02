package com.team.olympics.athlete;

/**
 * @author Wu Fei
 * @description the class of one athlete
 * @date 2021/11/2
 */

public class AmericanAthlete extends AbstractAthlete{
    public AmericanAthlete(String name, String skill) {
        super(name, skill);
    }

    @Override
    public void speak() {
        System.out.println("I can speak English");
    }
}
