package com.team.olympics.criteria;

import com.team.olympics.ground.GameGround;

import java.util.List;

public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria another;

    public AndCriteria(Criteria criteria, Criteria another) {
        this.criteria = criteria;
        this.another = another;
    }

    @Override
    public List<GameGround> fitsCriteria(List<GameGround> grounds) {
        List<GameGround> firstCriteria = criteria.fitsCriteria(grounds);
        return another.fitsCriteria(firstCriteria);
    }
}
