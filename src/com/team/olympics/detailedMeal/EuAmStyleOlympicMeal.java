package com.team.olympics.detailedMeal;

import com.team.olympics.twoKindsMeals.OlympicMeal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Gu HungJou
 * @date: 2021/10/31 21:36
 * Describe:
 */
public class EuAmStyleOlympicMeal extends OlympicMeal {
    @Override
    public void initIngredientList() {
        this.ingredientList=new ArrayList<>();
        this.ingredientList.add("energy:"+this.energy);
        this.ingredientList.add("protein:"+this.protein);
        this.ingredientList.add("fat:"+this.fat);
        this.ingredientList.add("carbohydrate:"+this.carbohydrate);
        this.ingredientList.add("sodium:"+this.sodium);
        System.out.println("the nutritions contain in this style are:");
        for(String s:this.ingredientList){
            System.out.print(s+" ");
        }
    }

    @Override
    protected void setName(String name) {
        this.productName=name;
    }

    @Override
    public String getName() {
        this.setName("Euro and American style meal for players");
        return this.productName;
    }

    @Override
    public boolean getState() {
        if(this.state) {
            System.out.println("start transporting Euro and American style meal...");
       gotoNextState();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("oh,no!!  the car tram in the road ,some players may can not have meal on time,so we need to chang a other road!");
            System.out.println("press any key to reschedule the route...");
            Scanner scanner=new Scanner(System.in);
            scanner.nextInt();
            System.out.println("the car is running...");
            gotoNextState();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("finally the car successfully arrived at the Canteen...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return this.state;
    }

    @Override
    protected void gotoNextState() {
        this.state=false;
    }

    @Override
    protected void setProducedDate(String date) {
        this.producedDate=date;
    }

    @Override
    public String getProducedDate() {
        this.setProducedDate("2021-11-06 08:56:12");
        return this.producedDate;
    }

    @Override
    protected void setChefName(String chefName) {
        this.chefName=chefName;
    }

    @Override
    public String getChefName() {
        this.setChefName("Jack");
        return this.chefName;
    }

    @Override
    protected void setPrice(String price) {
        this.price=price;
    }

    @Override
    public String getPrice() {
       this.setPrice("13");
       return this.price;
    }

    @Override
    public void producing() {
        System.out.println("欧美团队正在制作欧美风格运动员餐...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
