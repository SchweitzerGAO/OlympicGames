package com.team.olympics.player;


import com.team.olympics.Status.*;

import com.team.olympics.game.gender.Gender;


/**
 * Please fill in this Player class
 */
public abstract class Player {

    private String name;
    private String playGame;
    private String nation;
    private Status currentStatus,DieStatus,WeakStatus,TiredStatus,CommonStatus,StrongStatus;
    private int StatusNum;

    public Player(){

    }
    public Player(String name, String playGame,String nation) {
        this.name = name;
        this.playGame = playGame;
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayGame() {
        return playGame;
    }

    public void setPlayGame(String playGame) {
        this.playGame = playGame;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }


}
