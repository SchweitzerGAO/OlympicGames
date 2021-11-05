package com.team.olympics.criteria;

import com.team.olympics.ground.GameGround;

import java.util.ArrayList;
import java.util.List;

public class IsFieldTrace implements Criteria{
    @Override
    public List<GameGround> fitsCriteria(List<GameGround> grounds) {
        List<GameGround> fieldTraces = new ArrayList<>();
        for(GameGround ground: grounds)
        {
            if(ground.getType().equalsIgnoreCase("Field Trace"))
            {
                fieldTraces.add(ground);
            }
        }
        return fieldTraces;
    }
}
