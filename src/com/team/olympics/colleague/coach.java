package com.team.olympics.colleague;

import com.team.olympics.leader.teamLeader;

/**
 * @author: Gu HungJou
 * @date: 2021/11/1 20:12
 * Describe:
 */
public class coach extends colleague{
    public coach(teamLeader leader) {
        super(leader);
    }


    @Override
    public void feedBack(String s,String to) {
        leader.receiveFeedBack(s,to);
    }

    @Override
    public void notification(String message) {
        System.out.println(leader.nationalTeam+"的教练员部收到通知:"+message);
    }
}
