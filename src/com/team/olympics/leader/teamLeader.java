package com.team.olympics.leader;

import com.team.olympics.colleague.advocator;
import com.team.olympics.colleague.athlete;
import com.team.olympics.colleague.coach;
import com.team.olympics.colleague.teamDoctor;
import com.team.olympics.committeeChairman.committeeChairman;

/**
 * @author: Gu HungJou
 * @date: 2021/11/1 20:19
 * Describe:
 */
public class teamLeader implements leader {
    public String nationalTeam;

    public teamLeader(String nationalTeam) {
        this.nationalTeam = nationalTeam;
    }

    @Override
    public void dispatchNotification(String depart, String message) {
        com.team.olympics.colleague.colleague colleague;
        switch (depart) {
            case "athlete":
                colleague = new athlete(this);
                colleague.notification(message);
                break;
            case "coach":
                colleague = new coach(this);
                colleague.notification(message);
                break;
            case "teamDoctor":
                colleague = new teamDoctor(this);
                colleague.notification(message);
                break;
            case "advocator":
                colleague = new advocator(this);
                colleague.notification(message);
                break;
        }
    }

    @Override
    public void receiveFeedBack(String s, String to) {
        if (to.equals("committee")) {
            committeeChairman.receiveFeedBack(s, this.nationalTeam);
        } else {
            this.dispatchNotification(to, s);
        }
    }
}
