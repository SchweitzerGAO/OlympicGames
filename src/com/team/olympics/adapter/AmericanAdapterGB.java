package com.team.olympics.adapter;

//定义适配器类（SD兼容TF）
//定义适配器类（从国标插座通过适配器得到电源）
public class AmericanAdapterGB extends GBsocketImpl implements AmericanSocket {

    public void AmericanSocketGetElectricity(String appliance){
        System.out.println("美标插头从国标插座通过适配器接通电源");
        GBgetElectricity(appliance);
    }
}