package com.team.olympics.command;

public class FlagRaiser {
    public void raiseflag(String sport,String flag1,String flag2,String flag3){

        System.out.println(sport+"比赛项目：");
        System.out.println("已悬挂好"+flag1+"、"+flag2+"、"+flag3+"的国旗");
        System.out.println("正在升起国旗：");
        System.out.println("冠军:"+flag1);
        System.out.println("亚军:"+flag2);
        System.out.println("季军:"+flag3);
        System.out.println("升旗完毕！\n");
    }
}
