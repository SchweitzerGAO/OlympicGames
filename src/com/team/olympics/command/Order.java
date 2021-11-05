package com.team.olympics.command;


public class Order {

    //奥运会要升起的三面国旗
    private String sport;
    private String flag1;//冠军国旗
    private String flag2;//亚军国旗
    private String flag3;//季军国旗
    // 用来

    public String getSport(){
        return sport;
    }
    public String getFlag1() {
        return flag1;
    }
    public String getFlag2() {
        return flag2;
    }
    public String getFlag3() {
        return flag3;
    }

    public void setSport(String sport){
        this.sport=sport;
    }
    public void setFlag1(String flag1) {
        this.flag1 = flag1;
    }
    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }
    public void setFlag3(String flag3) {
        this.flag3 = flag3;
    }

}

