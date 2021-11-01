package com.team.olympics.site;

import com.team.olympics.person.staff.sitemaintenancestaff.SiteMaintenanceStaff;

public class GameField extends Site {

    /**
     * constructor of PublicArea
     */
    public GameField(String location) {
        super(location);
    }

    public GameField() {
        this("Game Field");
    }

    /**
     * @return name of the site as a String
     */
    @Override
    public String toString() {
        return SiteNameConst.GAME_FIELD;
    }


    /**
     * maintain field facility
     */
    public void getFieldFacilityMaintained() {
        System.out.println("The facility in the game field has been maintained.");
    }

    /**
     * Visitor Pattern: accept a site maintenance staff to maintenance the site
     *
     * @param staff the site maintenance staff
     */
    public void accept(SiteMaintenanceStaff staff){
        staff.visit(this);
    };
}
