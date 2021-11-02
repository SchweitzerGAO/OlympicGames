package com.team.olympics.athlete;

/**
 * @author Wu Fei
 * @description the class of one athlete factory
 * @date 2021/11/2
 */

public class ChineseAthleteFactory extends AbstractAthleteFactory{
    String[] names={"Li Na","Li Mao","Mei Mingzi","Xiao Ming","Xiao Hong"};
    String[] skills={"run","swim","sleep","fly","code"};

    @Override
    public AbstractAthlete produce() {
        return new ChineseAthlete(names[(int) (Math.random()*4)],skills[(int) (Math.random()*4)]);
    }
}
