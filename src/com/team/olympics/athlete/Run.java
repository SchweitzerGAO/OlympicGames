package com.team.olympics.athlete;

public class Run implements Skill{
    @Override
    public void play() {
        System.out.println("run");
    }

    @Override
    public String toString() {
        return "run";
    }
}
