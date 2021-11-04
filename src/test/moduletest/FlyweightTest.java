package test.moduletest;

import com.team.olympics.flag.Flag;
import com.team.olympics.flag.FlagFactory;

/**
 * @author Wu Fei
 * @description the test class for flyweight pattern
 * @date 2021/11/2
 */

public class FlyweightTest {
    public static void flyweightTest(){
        //Produce three flags.
        Flag flag1= FlagFactory.produce("China");
        Flag flag2= FlagFactory.produce("USA");
        Flag flag3= FlagFactory.produce("France");
        FlagFactory.give_back(flag1);
        //Should output the code of flag1.
        Flag flag4= FlagFactory.produce("China");
        System.out.println("----------------------FlyweightTest ends----------------------");
    }

    public static void main(String ...arg){
        System.out.println("---------------------- FlyweightTest -------------------------");
        System.out.println("FlagFactory:a class produces and stores the flags,by static methods");
        System.out.println("produce():produce one flag if repository doesn't have one,or just get one from repository");
        System.out.println("give_back():give back the flag to the flag factory");
        System.out.println("-------------------------------------------------------------");
        flyweightTest();
    }
}
