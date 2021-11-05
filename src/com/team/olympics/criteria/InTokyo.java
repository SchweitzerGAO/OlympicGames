package com.team.olympics.criteria;

import com.team.olympics.ground.GameGround;

import java.util.ArrayList;
import java.util.List;

public class InTokyo implements Criteria{

    @Override
    public List<GameGround> fitsCriteria(List<GameGround> grounds) {
        List<GameGround> tokyo = new ArrayList<>();
        for(GameGround ground: grounds)
        {
            if(ground.getLocation().equalsIgnoreCase("Tokyo"))
            {
                tokyo.add(ground);
            }
        }
        return tokyo;
    }
}
