package com.team.olympics.memento;

/***
 * @author syq
 * @description 备忘录，记录Runner状态
 */
public class Memento {
    public double getTime() {
        return time;
    }

    private double time;

    public String getName() {
        return name;
    }

    Memento(double time,String name){
        this.time=time;
        this.name=name;
    }
    private String name;


}
