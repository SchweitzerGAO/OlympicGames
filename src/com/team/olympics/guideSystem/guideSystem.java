package com.team.olympics.guideSystem;

import com.team.olympics.logisticDepart.logistics;

/**
 * @author Gu HungJou
 * @date 2021/11/1 13:04
 * Describe:
 */
public abstract class guideSystem implements logistics {
    protected String location;

    public void setLocation(String location){
        this.location=location;
    }
    @Override
    public void setImplementMan() {
        System.out.println("Amal");
    }


    public abstract void add(guideSystem guideSystem);

    public void show(){}
    public guideSystem getChild(int i){ return null;}
    public void remove(guideSystem guide){}

}
