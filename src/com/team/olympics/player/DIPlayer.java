package com.team.olympics.player;

/**
 * CAUTION: This class is FINAL and is NOT extendable
 * @author Charles Gao
 * @description the player class(shall be abstract and extended in the future) temporarily used in DI Pattern
 * @date 2021/10/25
 */
public final class DIPlayer {
    private String name;
    private String gender;
    private String nation;
    private String playGame;

    public DIPlayer(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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


    public void showDI()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Gender: "+this.gender);
        System.out.println("Nation: "+this.nation);
        System.out.println("Playing: "+this.playGame);
        System.out.println();
    }
}
