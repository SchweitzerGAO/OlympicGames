package com.team.olympics.site.publicarea;

import com.team.olympics.person.staff.sitemaintenancestaff.SiteMaintenanceStaff;
import com.team.olympics.site.SiteNameConst;

public class SpectatorStand extends PublicArea {

    /**
     * constructor of the SpectatorStand with maximum number of spectators
     */
    public SpectatorStand(String location, int maxNumber) {
        super(location, maxNumber);
    }

    public SpectatorStand() {
        this("Dining room",10000);
    }

    /**
     * @return name of the site as a String
     */
    @Override
    public String toString() {
        return SiteNameConst.SPECTATOR_STAND;
    }

    /**
     * maintain the devices in the spectator stand
     */
    public void getDevicesMaintained() {
        System.out.println("The seats and bleachers in the spectator stand have been maintained.");
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
