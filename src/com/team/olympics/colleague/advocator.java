package com.team.olympics.colleague;

import com.team.olympics.leader.teamLeader;

/**
 * @author: Gu HungJou
 * @date: 2021/11/1 20:13
 * Describe:
 */
public class advocator extends colleague{
    public advocator(teamLeader leader) {
        super(leader);
    }

    @Override
    public void feedBack(String s,String to) {
        leader.receiveFeedBack(s,to);
    }

    @Override
    public void notification(String message) {
        System.out.println(leader.nationalTeam+"的宣传部收到通知:"+message);
    }
}
