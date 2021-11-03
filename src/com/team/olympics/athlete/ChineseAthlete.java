package com.team.olympics.athlete;

/**
 * @author Wu Fei
 * @description the class of one athlete
 * @date 2021/11/2
 */

public class ChineseAthlete extends AbstractAthlete{
    public ChineseAthlete(String name, Skill skill) {
        super(name, skill);
    }

    @Override
    public void speak() {
        System.out.println("I can speak Chinese.");
    }
}
