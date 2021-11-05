package com.team.olympics.proxy;

//电视台转播
public class TelevisionRelay implements LiveBroadcast{
    private OlympicHostFilmingLive OlympicFilmingLive=new OlympicHostFilmingLive();

    @Override
    public void BroadcastLive() {
        System.out.println("电视台正在转播现场赛事");
        OlympicFilmingLive.BroadcastLive();
    }
}
