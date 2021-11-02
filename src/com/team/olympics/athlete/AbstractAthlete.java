package com.team.olympics.athlete;

/**
 * @author Wu Fei
 * @description the super class of two athletes
 * @date 2021/11/2
 */

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
