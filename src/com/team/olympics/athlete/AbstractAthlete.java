package com.team.olympics.athlete;

public abstract class AbstractAthlete {
    private String name;
    private String skill;
    public abstract void speak();
    public void intro(){
        System.out.println("My name is "+name+".I can "+skill+'.');
    }
    public AbstractAthlete(String name,String skill){
        this.name=name;
        this.skill=skill;
    }
}
