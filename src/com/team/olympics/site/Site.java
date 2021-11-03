package com.team.olympics.site;

import com.team.olympics.person.staff.sitemaintenancestaff.SiteMaintenanceStaff;

public abstract class Site {

    /**
     * location of this site
     */
    protected String location;

    public Site(String location) {
        this.location = location;
    }


    public Site() {
        this("Default Location");
    }

    /**
     * @return name of the site as a String
     */
    @Override
    public abstract String toString();

    /**
     * @return location of this site
     */
    public String getLocation() {
        return this.location;
    }


    /**
     * print a line to show that the site is cleaned up
     */
    public void getCleanUp() {
        System.out.println("The " + toString() + " is cleaned up.");
    }

    /**
     * Visitor Pattern: accept a site maintenance staff to maintain the site
     *
     * @param staff the site maintenance staff
     */
    public abstract void accept(SiteMaintenanceStaff staff);

}
