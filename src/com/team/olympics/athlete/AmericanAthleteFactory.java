package com.team.olympics.athlete;

/**
 * @author Wu Fei
 * @description the class of one athlete factory
 * @date 2021/11/2
 */

public class AmericanAthleteFactory extends AbstractAthleteFactory {

    private String[] names ={"Bob","Alen","Null","Pointer","Alex"};
    private Skill[] skills={new Run(),new Swim()};
    @Override
    public AbstractAthlete produce() {
        return new AmericanAthlete(names[(int) (Math.random()*4)],skills[(int) (Math.random()*1)]);
    }
}
