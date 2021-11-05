package com.team.olympics.proxy;
//奥运会举办方官方摄像
public class OlympicHostFilmingLive implements LiveBroadcast{
    @Override
    public void BroadcastLive() {
        System.out.println("奥运会举办方在比赛场地进行现场直播");
    }
}
