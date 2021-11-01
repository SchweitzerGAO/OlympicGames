package com.team.olympics.person.staff.sitemaintenancestaff;

import com.team.olympics.person.staff.Staff;
import com.team.olympics.site.GameField;
import com.team.olympics.site.publicarea.DiningRoom;
import com.team.olympics.site.publicarea.ExhibitionArea;
import com.team.olympics.site.publicarea.PublicArea;

public class Cleaner extends Staff implements SiteMaintenanceStaff {


    public Cleaner(String name, int age, Sex sex) {
        super(name, age, sex);
    }

    @Override
    public void work() {
        System.out.println("The cleaner " + this.name + "is working.");
    }

    @Override
    public void rest() {
        System.out.println("The cleaner " + this.name + "goes to rest.");
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
        s.getCleanUp();
    }

    @Override
    public void visit(GameField s) {

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
        s.getCleanUp();
    }

}
