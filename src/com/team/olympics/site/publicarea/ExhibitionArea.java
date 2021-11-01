package com.team.olympics.site.publicarea;

import com.team.olympics.person.staff.sitemaintenancestaff.SiteMaintenanceStaff;
import com.team.olympics.site.SiteNameConst;

import java.util.ArrayList;

public class ExhibitionArea extends PublicArea{

    /**
     * List of all exhibits
     **/
    protected ArrayList<String> exhibitionList;

    /**
     * constructor of ExhibitionRoom
     */
    public ExhibitionArea(String location, int maxNumber) {
        super(location, maxNumber);
        exhibitionList = new ArrayList<String>();
    }


    /**
     * @return name of the site as a String
     */
    @Override
    public String toString() {
        return SiteNameConst.EXHIBITION_AREA;
    }

    /**
     * tourists visit the exhibition room, print all exhibits in the room
     */
    public void visitExhibitionRoom() {
        if (exhibitionList.size() > 0) {
            System.out.println("There are exhibits below in the area：");
        } else {
            System.out.println("There are no exhibits in the area.");
            return;
        }
        for (String item : exhibitionList) {
            System.out.print(item);
            if (exhibitionList.indexOf(item) < exhibitionList.size() - 1) {
                System.out.print("、");
            } else {
                System.out.println(".");
            }
        }
    }

    /**
     * add an exhibition to the room
     *
     * @param exhibitionName exhibit to be added to the area
     */
    public void addExhibits(String exhibitionName) {
        if (exhibitionList.contains(exhibitionName)) {
            System.out.println("Exhibits are already in the area.");
        } else {
            exhibitionList.add(exhibitionName);
        }
    }

    /**
     * remove an exhibit
     *
     * @param exhibitionName exhibition to be removed
     */
    public void removeExhibits(String exhibitionName) {
        if (exhibitionList.contains(exhibitionName)) {
            exhibitionList.remove(exhibitionName);
        } else {
            System.out.println("Exhibitions are not in the area.");
        }
    }

    /**
     * Visitor Pattern: accept a site maintenance staff to maintain the site
     *
     * @param staff the site maintenance staff
     */
    @Override
    public void accept(SiteMaintenanceStaff staff) {
        staff.visit(this);
    }
}
