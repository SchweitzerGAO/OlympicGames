package com.team.olympics.TransportationMVC;

/**
 * @author: Gu HungJou
 * @date: 2021/11/5 10:43
 * Describe:
 */
public class TransitModel {
    private String carNo;
    private boolean carState;
    private String fromPlace;
    private String toPlace;

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public boolean getCarState() {
        return carState;
    }

    public void setCarState(boolean carState) {
        this.carState = carState;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }
}
