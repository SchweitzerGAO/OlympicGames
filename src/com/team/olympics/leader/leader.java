package com.team.olympics.leader;

/**
 * @author Gu HungJou
 * @date 2021/11/1 20:18
 * Describe:
 */
public interface leader {
    void dispatchNotification(String depart, String message);
    void receiveFeedBack(String s, String to);
}
