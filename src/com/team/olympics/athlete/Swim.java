package com.team.olympics.athlete;

public class Swim implements Skill{

    @Override
    public void play() {
        System.out.println("swim");
    }

    @Override
    public String toString() {
        return "swim";
    }
}
