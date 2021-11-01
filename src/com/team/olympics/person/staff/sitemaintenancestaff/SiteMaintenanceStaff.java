package com.team.olympics.person.staff.sitemaintenancestaff;

import com.team.olympics.site.GameField;
import com.team.olympics.site.publicarea.DiningRoom;
import com.team.olympics.site.publicarea.ExhibitionArea;
import com.team.olympics.site.publicarea.PublicArea;

public interface SiteMaintenanceStaff {

    /**
     * Visitor Pattern: worker maintenance sites
     *
     * @param s concrete site
     */

    void visit(PublicArea s);

    void visit(GameField s);

    void visit(ExhibitionArea s);

    void visit(DiningRoom s);


}
