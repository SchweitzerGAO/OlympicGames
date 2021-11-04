package test.moduletest;

import com.team.olympics.athlete.Athlete;
import com.team.olympics.athlete.AmericanAthleteFactory;
import com.team.olympics.athlete.Sleep;

/**
 * @author Wu Fei
 * @description the test class for strategy pattern
 * @date 2021/11/2
 */

public class StrategyTest {
    public static void strategyTest(){
        AmericanAthleteFactory americanAthleteFactory=new AmericanAthleteFactory();
        Athlete americanAthlete= americanAthleteFactory.produce();
        //use the strategy
        americanAthlete.play();
        //change the strategy
        americanAthlete.setSkill(new Sleep());
        //should output a different result
        americanAthlete.play();
        System.out.println("------------------------Strategy ends------------------------");
    }

    public static void main(String[] args) {
        System.out.println("------------------------- Strategy ---------------------------");
        System.out.println("AmericanAthleteFactory():A class extending AbstractAthleteFactory");
        System.out.println("produce():Producing an athlete");
        System.out.println("play():use the strategy");
        System.out.println("setSkill():change the strategy");
        System.out.println("-------------------------------------------------------------");
        strategyTest();
    }
}
