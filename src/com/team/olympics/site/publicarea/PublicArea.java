package com.team.olympics.site.publicarea;

import com.team.olympics.person.staff.sitemaintenancestaff.SiteMaintenanceStaff;
import com.team.olympics.site.Site;

import java.util.LinkedList;

public abstract class PublicArea extends Site {

    /**
     * The max number of visitors in the area
     **/
    protected int maxVisitorNumber;

    /**
     * constructor of PublicArea
     */
    public PublicArea(String location, int maxNumber) {
        super(location);
        this.maxVisitorNumber = maxNumber;
    }

    public PublicArea() {
        this("Public Location", 10000);
    }

    /**
     * @return name of the site as a String
     */
    @Override
    public abstract String toString();




    /**
     * Visitor Pattern: accept a site maintenance staff to maintenance the scene
     *
     * @param staff the site maintenance staff
     */
    public abstract void accept(SiteMaintenanceStaff staff);

}
