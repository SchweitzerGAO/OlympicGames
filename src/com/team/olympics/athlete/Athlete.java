package com.team.olympics.athlete;

/**
 * @author Wu Fei
 * @description the super class of two athletes
 * @date 2021/11/2
 */

public abstract class Athlete {
    private String name;
    protected Skill skill;
    public abstract void speak();
    public void intro(){
        System.out.println("My name is "+name+".I can "+skill+'.');
    }
    //constructor
    public Athlete(String name, Skill skill){
        this.name=name;
        this.skill=skill;
    }
    //setter of the strategy
    public void setSkill(Skill skill){
        this.skill=skill;
    }
    public void play() {skill.play();}
}
