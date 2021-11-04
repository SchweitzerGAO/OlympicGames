package com.team.olympics.foul;
// com.team.olympics.referee

public class foul {
    private String game;//比赛名称
    private  int level;//犯规等级

    public foul(String game, int i) {
        this.game=game;
        this.level=i;
    }

    public String getGame(){
        return game;
    }
    public  int getlevel(){
        return level;
    }


}
