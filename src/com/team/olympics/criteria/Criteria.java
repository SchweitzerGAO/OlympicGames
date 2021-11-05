package com.team.olympics.criteria;


import com.team.olympics.ground.GameGround;

import java.util.List;

public interface Criteria {
    List<GameGround> fitsCriteria(List<GameGround> grounds);
}
