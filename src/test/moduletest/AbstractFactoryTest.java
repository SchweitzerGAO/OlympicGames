package test.moduletest;

import com.team.olympics.athlete.AbstractAthlete;
import com.team.olympics.athlete.AmericanAthleteFactory;
import com.team.olympics.athlete.ChineseAthleteFactory;

/**
 * @author Wu Fei
 * @description the test class for abstract factory pattern
 * @date 2021/11/2
 */

public class AbstractFactoryTest {
    public static void abstractFactoryTest(){
        //Producing one American athlete
        AmericanAthleteFactory americanAthleteFactory =new AmericanAthleteFactory();
        System.out.println("An AmericanAthleteFactory is built.");
        AbstractAthlete american1= americanAthleteFactory.produce();
        System.out.println("An American athlete is produced.");
        System.out.println("He/She introduces himself/herself and speaks his/her language.");
        american1.intro();
        american1.speak();
        //Producing one Chinese athlete
        ChineseAthleteFactory chineseAthleteFactory=new ChineseAthleteFactory();
        System.out.println("An ChineseAthleteFactory is built.");
        AbstractAthlete chinese1=chineseAthleteFactory.produce();
        System.out.println("An Chinese athlete is produced.");
        System.out.println("He/She introduces himself/herself and speaks his/her language.");
        chinese1.intro();
        chinese1.speak();
        System.out.println("-------------------AbstractFactoryTest ends-------------------");
    }

    public static void main(String[] args){
        System.out.println("--------------------- AbstractFactory ------------------------");
        System.out.println("AmericanAthleteFactory():A class extending AbstractAthleteFactory");
        System.out.println("ChineseAthleteFactory():A class extending AbstractAthleteFactory");
        System.out.println("produce():Producing an athlete");
        System.out.println("intro():Introducing an athlete");
        System.out.println("speak():An method extending AbstractAthlete.speak()");
        System.out.println("-------------------------------------------------------------");
        abstractFactoryTest();
    }
}
