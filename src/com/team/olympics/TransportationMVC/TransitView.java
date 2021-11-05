package com.team.olympics.TransportationMVC;

/**
 * @author Gu HungJou
 * @date 2021/11/5 10:43
 * Describe:
 */
public class TransitView {
    public void viewTransitInfo(String carNo,Boolean carState,String fromPlace,String toPlace){
        System.out.print("车辆编号为："+carNo+"，车辆状态为：");
        if(!carState){
            System.out.print("忙碌");
            System.out.println("，起始点为："+fromPlace+"，终点为："+toPlace+"...");
        }else{
            System.out.println("空闲...");
        }
    }
}
