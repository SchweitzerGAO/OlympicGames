package com.team.olympics.colleague;

import com.team.olympics.leader.teamLeader;

/**
 * @author: Gu HungJou
 * @date: 2021/11/1 20:59
 * Describe:
 */
public abstract class colleague {
    public teamLeader leader;

    public colleague(teamLeader leader) {
        this.leader = leader;
    }


    public abstract void feedBack(String s,String to);
    public abstract void notification(String message);
}
