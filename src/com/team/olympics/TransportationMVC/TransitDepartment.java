package com.team.olympics.TransportationMVC;

import com.team.olympics.logisticDepart.logistics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Gu HungJou
 * @date: 2021/11/5 10:43
 * Describe:
 */
public class TransitDepartment implements logistics {
    public static void dispatch() throws InterruptedException {
        List<TransitModel> transitModels = initTransitInfo();
        TransitView transitView=new TransitView();
        System.out.println("当前车辆状态为：");
        for(TransitModel t:transitModels){
            TransitController controller=new TransitController(t,transitView);
            Thread.sleep(1500);
            controller.updateTransitView();
        }
        System.out.println();
        Thread.sleep(1500);
        System.out.println("交通运输处给A1004车辆分发了新任务，要求他运送已经完成比赛任务的美国体操队到机场去...");
        Thread.sleep(1500);
        TransitController contr=new TransitController(transitModels.get(3),transitView);
        contr.setCarState(false);
        contr.setFromPlace("奥运村B区停车场");
        contr.setToPlace("流亭国际机场T3出发层");
        System.out.println("当前车辆状态为：");
        for(TransitModel t:transitModels){
            TransitController controller=new TransitController(t,transitView);
            Thread.sleep(1500);
            controller.updateTransitView();
        }

        System.out.println();
        Thread.sleep(1500);
        System.out.println("A1002号车辆、A1004号车辆完成任务归来...");
        Thread.sleep(1500);
        TransitController c1=new TransitController(transitModels.get(1),transitView);
        TransitController c2=new TransitController(transitModels.get(3),transitView);
        c1.setCarState(true);
        c1.setFromPlace("");
        c1.setToPlace("");
        c2.setCarState(true);
        c2.setFromPlace("");
        c2.setToPlace("");
        System.out.println("当前车辆状态为：");
        for(TransitModel t:transitModels){
            TransitController controller=new TransitController(t,transitView);
            Thread.sleep(1500);
            controller.updateTransitView();
        }
    }

    public static List<TransitModel> initTransitInfo() {
        List<TransitModel> transitList = new ArrayList<>();
        TransitModel t1 = new TransitModel();
        t1.setCarNo("A1001");
        t1.setCarState(true);
        t1.setFromPlace(" ");
        t1.setToPlace(" ");
        TransitModel t2 = new TransitModel();
        t2.setCarNo("A1002");
        t2.setCarState(false);
        t2.setFromPlace("青霞国际机场T1");
        t2.setToPlace("奥运村E区停车场");
        TransitModel t3 = new TransitModel();
        t3.setCarNo("A1003");
        t3.setCarState(false);
        t3.setFromPlace("奥运村D区停车场");
        t3.setToPlace("南莜奥运游泳馆");
        TransitModel t4 = new TransitModel();
        t4.setCarNo("A1004");
        t4.setCarState(true);
        t4.setFromPlace(" ");
        t4.setToPlace(" ");
        transitList.add(t1);
        transitList.add(t2);
        transitList.add(t3);
        transitList.add(t4);
        return transitList;
    }

    @Override
    public void setImplementMan() {
        System.out.println("交通运输处负责人为：Amanda...");
    }
}
