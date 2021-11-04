package com.team.olympics.referee;
import com.team.olympics.foul.foul;


public abstract class referee{
    public referee next;
    protected String game;

    public referee(String game) {
        this.game = game;
    }
    public void setNext(referee next) {
        this.next = next;
    }
    public abstract boolean process(foul Foul);

}


