package com.team.olympics.guideSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Gu HungJou
 * @date: 2021/11/1 13:18
 * Describe:
 */
public class guideBorderGroup extends guideSystem{
    private List<guideSystem> array=new ArrayList<>();

    @Override
    public void add(guideSystem guideSystem) {
    array.add(guideSystem);
    }
@Override
    public void show() {
        for(guideSystem o:array){
            o.show();
        }
    }
@Override
    public guideSystem getChild(int i){
        return array.get(i);
    }
@Override
    public void remove(int i) {
        array.remove(i);
    }
}
