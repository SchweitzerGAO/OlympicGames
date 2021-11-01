package com.team.olympics.site;

import com.team.olympics.person.staff.sitemaintenancestaff.SiteMaintenanceStaff;

import java.util.ArrayList;
import java.util.List;

public class SiteStructure {

    /**
     * all sites in the Olympics
     */
    private List<Site> sites;

    /**
     * constructor of the class SiteStructure
     */
    public SiteStructure() {
        sites = new ArrayList<Site>();
    }

    /**
     * Add a site to the collection list
     *
     * @param s new scene object
     */
    public void addSite(Site s) {
        sites.add(s);
    }

    /**
     * staff maintain all sites in the list
     *
     * @param staff the staff to maintain the site
     */
    public void accept(SiteMaintenanceStaff staff) {
        for (Object obj : sites) {
            ((Site) obj).accept(staff);
        }
    }

    /**
     * get a scene object from the scene list by its name
     *
     * @param name name of the site to be found
     * @return object of the site found (return null if not found)
     */
    public Site getSiteByName(String name) {
        for (Site item : sites) {
            if (item.toString().equals(name)) {
                return item;
            }
        }
        return null;
    }
}
