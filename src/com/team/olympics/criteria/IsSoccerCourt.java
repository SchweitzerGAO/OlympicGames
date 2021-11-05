package com.team.olympics.criteria;

import com.team.olympics.ground.GameGround;

import java.util.ArrayList;
import java.util.List;

public class IsSoccerCourt implements Criteria{
    @Override
    public List<GameGround> fitsCriteria(List<GameGround> grounds) {
        List<GameGround> soccerCourts = new ArrayList<>();
        for(GameGround ground: grounds)
        {
            if(ground.getType().equalsIgnoreCase("Soccer Court"))
            {
                soccerCourts.add(ground);
            }
        }
        return soccerCourts;
    }
}
