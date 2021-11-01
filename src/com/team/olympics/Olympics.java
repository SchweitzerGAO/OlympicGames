package com.team.olympics;

import com.team.olympics.person.Person;
import com.team.olympics.person.staff.sitemaintenancestaff.Cleaner;
import com.team.olympics.person.staff.sitemaintenancestaff.FacilityMaintainer;
import com.team.olympics.person.staff.sitemaintenancestaff.SiteMaintenanceStaff;
import com.team.olympics.site.GameField;
import com.team.olympics.site.Site;
import com.team.olympics.site.SiteStructure;
import com.team.olympics.site.publicarea.DiningRoom;
import com.team.olympics.site.publicarea.ExhibitionArea;
import com.team.olympics.site.publicarea.SpectatorStand;

public class Olympics {
    /**
     * the only one instance of the Olympics Games
     */
    private static Olympics instance = null;

    /**
     * scene structure containing all sites in the Olympics
     */
    private SiteStructure sites;

    /**
     * flag showing whether the factory is to be cleaned
     */
    private boolean dirtyFlag = false;

    /**
     * flag showing whether the facility is to be maintained
     */
    private boolean damagedFlag = false;

    /**
     * constructor of the factory
     */
    private Olympics() {
        sites = new SiteStructure();
        sites.addSite(new ExhibitionArea("", 1000));
        sites.addSite(new DiningRoom("", 200));
        sites.addSite(new SpectatorStand("", 10000));
        sites.addSite(new GameField(""));
    }

    /**
     * using Singleton pattern to get or create the only one instance of the class
     *
     * @return the only one instance of the Olympics class
     */
    public static Olympics getOlympics() {
        if (instance == null) {
            instance = new Olympics();
        }
        return instance;
    }

    /**
     * add a site to the Olympics
     *
     * @param site the scene to be added to the Olympics
     */
    public void addSite(Site site) {
        sites.addSite(site);
    }

    /**
     * set the dirty flag true
     */
    public void setDirtyTrue() {
        this.dirtyFlag = true;
    }

    /**
     * get the value of dirty flag
     *
     * @return the value of dirty flag
     */
    public boolean getDirtyFlag() {
        return this.dirtyFlag;
    }


    /**
     * set the damaged flag true
     */
    public void setDamagedTrue() {
        this.damagedFlag = true;
    }

    /**
     * get the value of aging flag
     *
     * @return the value of aging flag
     */
    public boolean getAgingFlag() {
        return this.damagedFlag;
    }

    /**
     * Periodically clean the scenes
     *
     * @param staff cleaner object
     */
    public void clean(Cleaner staff) {
        sites.accept(staff);
    }


    public void doClean() {

        // hire a temporary cleaner
        Cleaner cleaner = new Cleaner("cleaner A", 20, Person.Sex.MALE);

        clean(cleaner);
        dirtyFlag = false;

    }

    /**
     * Periodically maintain the scenes
     *
     * @param staff maintenance object
     */
    public void maintain(FacilityMaintainer staff) {
        sites.accept((SiteMaintenanceStaff) staff);
    }


    public void doMaintenance() {

        // hire a temporary maintenance worker
        FacilityMaintainer facilityMaintainer = new FacilityMaintainer("facility maintainer B", 20, Person.Sex.MALE);

        maintain(facilityMaintainer);
        damagedFlag = false;

    }
}
