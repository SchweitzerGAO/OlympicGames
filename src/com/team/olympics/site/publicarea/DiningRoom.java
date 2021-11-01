package com.team.olympics.site.publicarea;

import com.team.olympics.person.staff.sitemaintenancestaff.SiteMaintenanceStaff;
import com.team.olympics.site.SiteNameConst;

public class DiningRoom extends PublicArea {

    /**
     * constructor of the DiningRoom with maximum number of visitors
     */
    public DiningRoom(String location, int maxNumber) {
        super(location, maxNumber);
    }

    public DiningRoom() {
        this("Dining room",200);
    }

    /**
     * @return name of the site as a String
     */
    @Override
    public String toString() {
        return SiteNameConst.DINING_ROOM;
    }

    /**
     * maintain the devices in the dining room
     */
    public void getDevicesMaintained() {
        System.out.println("The tables and cookers in the dining room have been maintained.");
    }

    /**
     * Visitor Pattern: accept a site maintenance staff to maintenance the site
     *
     * @param staff the site maintenance staff
     */
    @Override
    public void accept(SiteMaintenanceStaff staff) {
        staff.visit(this);
    }
}
