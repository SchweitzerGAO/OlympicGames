package com.team.olympics.TransportationMVC;

/**
 * @author: Gu HungJou
 * @date: 2021/11/5 10:43
 * Describe:
 */
public class TransitController {
    private TransitModel transitModel;
    private TransitView transitView;

    public TransitController(TransitModel transitModel, TransitView transitView) {
        this.transitModel = transitModel;
        this.transitView = transitView;
    }

    public String getCarNo() {
        return transitModel.getCarNo();
    }

    public void setCarNo(String carNo) {
        this.transitModel.setCarNo(carNo);
    }

    public boolean isCarState() {
        return transitModel.getCarState();
    }

    public void setCarState(boolean carState) {
        this.transitModel.setCarState(carState);
    }

    public String getFromPlace() {
        return transitModel.getFromPlace();
    }

    public void setFromPlace(String fromPlace) {
        this.transitModel.setFromPlace(fromPlace);
    }

    public String getToPlace() {
        return transitModel.getToPlace();
    }

    public void setToPlace(String toPlace) {
        this.transitModel.setToPlace(toPlace);
    }

    public void updateTransitView(){
        this.transitView.viewTransitInfo(transitModel.getCarNo(), transitModel.getCarState(),transitModel.getFromPlace(),transitModel.getToPlace());
    }
}
