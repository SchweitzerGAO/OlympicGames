package com.team.olympics.criteria;

import com.team.olympics.ground.GameGround;

import java.util.ArrayList;
import java.util.List;

public class InBeijing implements Criteria{

    @Override
    public List<GameGround> fitsCriteria(List<GameGround> grounds) {
        List<GameGround> beijing = new ArrayList<>();
        for(GameGround ground: grounds)
        {
            if(ground.getLocation().equalsIgnoreCase("Beijing"))
            {
                beijing.add(ground);
            }
        }
        return beijing;
    }
}
