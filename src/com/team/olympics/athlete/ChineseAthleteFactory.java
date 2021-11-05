package com.team.olympics.athlete;

/**
 * @author Wu Fei
 * @description the class of one athlete factory
 * @date 2021/11/2
 */

public class ChineseAthleteFactory extends AbstractAthleteFactory{
    private String[] names={"Li Na","Li Mao","Mei Mingzi","Xiao Ming","Xiao Hong"};
    private Skill[] skills={new Run(),new Swim()};

    @Override
    public Athlete produce() {
        return new ChineseAthlete(names[(int) (Math.random()*4)],skills[(int) (Math.random()*1)]);
    }
}
