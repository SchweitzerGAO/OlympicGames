package com.team.olympics.person.staff.sitemaintenancestaff;

import com.team.olympics.person.Person;
import com.team.olympics.person.staff.Staff;
import com.team.olympics.site.GameField;
import com.team.olympics.site.publicarea.DiningRoom;
import com.team.olympics.site.publicarea.ExhibitionArea;
import com.team.olympics.site.publicarea.PublicArea;
import com.team.olympics.site.publicarea.SpectatorStand;

public class FacilityMaintainer extends Staff implements SiteMaintenanceStaff {

    public FacilityMaintainer(String name, int age, Person.Sex sex) {
        super(name, age, sex);
    }

    @Override
    public void work() {
        System.out.println("The maintenance worker " + this.name + "is working.");
    }

    @Override
    public void rest() {
        System.out.println("The maintenance worker " + this.name + "goes to rest.");
    }

    @Override
    public void feedBack() {

    }

    /**
     * implement methods defined in interface to maintain the public area
     *
     * @param s public area site
     */
    @Override
    public void visit(PublicArea s) {
        s.getExhibitionsMaintained();
    }


    /**
     * implement methods defined in interface to maintain the game field
     *
     * @param s game field site
     */
    @Override
    public void visit(GameField s) {
        s.getFieldFacilityMaintained();
    }

    @Override
    public void visit(ExhibitionArea s) {

    }

    /**
     * implement methods defined in interface to maintain the dining room
     *
     * @param s dining room site
     */
    @Override
    public void visit(DiningRoom s) {
        s.getDevicesMaintained();
    }

    @Override
    public void visit(SpectatorStand s) {

    }

}
