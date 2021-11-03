package com.team.olympics.flag;

import java.util.ArrayList;

/**
 * @author Wu Fei
 * @description factory of the flags
 * @date 2021/11/2
 */


public class FlagFactory {
    //depository of the flags
    private static final ArrayList<Flag> flags=new ArrayList<>();
    private static int num=0;

    //can not produce a FlagFactory
    private FlagFactory(){}
    public static void give_back(Flag flag){
        FlagFactory.flags.add(flag);
    }

    //If the repository has the flag,we will get it.
    //Else,we will produce one.
    public static Flag produce(String country){
        switch (country){
            case "China":{
                for (int i = 0; i < flags.size(); i++) {
                    if(flags.get(i).getClass()==ChineseFlag.class){//Reflection
                        System.out.println("Got a Chinese flag,no."+flags.get(i).code+".");
                        return flags.remove(i);
                    }
                }
                num++;
                System.out.println("Produced a Chinese flag,no."+num+".");
                return new ChineseFlag(num);
            }
            case "America":
            case "USA":{
                for (int i = 0; i < flags.size(); i++) {
                    if(flags.get(i).getClass()==AmericanFlag.class){
                        System.out.println("Got a American flag,no."+flags.get(i).code+".");
                        return flags.remove(i);
                    }
                }
                num++;
                System.out.println("Produced a American flag,no."+num+".");
                return new AmericanFlag(num);
            }
            case "France":{
                for (int i = 0; i < flags.size(); i++) {
                    if(flags.get(i).getClass()==FrenchFlag.class){
                        System.out.println("Got a French flag,no."+flags.get(i).code+".");
                        return flags.remove(i);
                    }
                }
                num++;
                System.out.println("Produced a French flag,no."+num+".");
                return new FrenchFlag(num);
            }
            default:return null;
        }
    }
}
