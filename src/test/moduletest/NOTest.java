package test.moduletest;

import com.team.olympics.nop.ConcreteNation;
import com.team.olympics.nop.Nation;
import com.team.olympics.nop.NullNation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NOTest {
    private static List<String> nations = new ArrayList<>();

    public static Nation getNation(String query)
    {
        for(String nation: nations)
        {
            if(query.equalsIgnoreCase(nation))
            {
                return new ConcreteNation(nation);
            }
        }
        return new NullNation();
    }

    public static void nullObjectTest()
    {
        nations.add("China");
        nations.add("USA");
        nations.add("Jamaica");
        nations.add("Russia");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag)
        {
            System.out.println("Please input the name of nation you want to query[\"quit\" to quit]:");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("quit"))
            {
                flag = false;
            }
            else
            {
                Nation nation = getNation(input);
                System.out.println(nation.getName());
            }
        }

    }
    public static void main(String[] args)
    {
        System.out.println("---------------------------- Null Object Pattern ----------------------------");
        System.out.println("getName(): return the name of nation(if exists) or warning string(if not)");
        System.out.println("--------------------------------------------------------------------------");
        nullObjectTest();
        System.out.println("--------------------------------- End ------------------------------------");
    }
}
