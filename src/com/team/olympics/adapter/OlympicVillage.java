package com.team.olympics.adapter;

//奥运村类，各国运动员在奥运村要通过插座用电
public class OlympicVillage {
    public void getElectricity(AmericanSocket americanSocket,String appliance) {
        americanSocket.AmericanSocketGetElectricity(appliance);
    }
}
