package com.team.olympics.committeeChairman;

import com.team.olympics.leader.leader;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Gu HungJou
 * @date: 2021/11/1 20:19
 * Describe:
 */
public class committeeChairman {

    public static List<leader> teamLeaders=new ArrayList<>();

    public static void setTeamLeaders(leader leaders) {
        teamLeaders.add(leaders);
    }

    public static void dispatchNotification(String depart, String message) {
        for(leader t:teamLeaders){
            t.dispatchNotification(depart,message);
        }
    }

    public static void receiveFeedBack(String s,String name) {
        System.out.println("奥组委主席办公室已收到"+"来自"+name+"的消息:"+s+",开始处理...");
    }
}
