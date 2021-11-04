package com.team.olympics.guideSystem;

/**
 * @author Gu HungJou
 * @date 2021/11/1 13:18
 * Describe:
 */
public class guideBorder extends guideSystem{
public String getLocation(){
    return this.location;
}
    @Override
    public void add(guideSystem guideSystem) {
    }

    @Override
    public void show() {
        System.out.println("在"+this.location+"安装了导引牌...");
    }
}
