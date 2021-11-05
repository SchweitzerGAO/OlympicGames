package com.team.olympics.adapter;

//TF卡实现类
//国标插座实现类
public class GBsocketImpl implements GBsocket {

    public void GBgetElectricity(String appliance) {
        System.out.println("实现"+appliance+"从国标插座接通电源");
    }

}