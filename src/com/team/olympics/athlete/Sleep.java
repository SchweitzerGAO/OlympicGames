package com.team.olympics.athlete;

public class Sleep implements Skill {
    @Override
    public void play() {
        System.out.println("sleep");
    }

    @Override
    public String toString() {
        return "sleep";
    }
}
