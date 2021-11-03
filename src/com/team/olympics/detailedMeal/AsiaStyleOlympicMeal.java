package com.team.olympics.detailedMeal;

import com.team.olympics.twoKindsMeals.OlympicMeal;

import java.util.ArrayList;

/**
 * @author: Gu HungJou
 * @date: 2021/10/31 21:42
 * Describe:
 */
public class AsiaStyleOlympicMeal extends OlympicMeal {
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
        this.setName("Asia style meal for players");
        return this.productName;
    }

    @Override
    public boolean getState() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("the foods successfully arrived at the Canteen...");
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
        this.setProducedDate("2021-11-06 08:42:55");
        return this.producedDate;
    }

    @Override
    protected void setChefName(String chefName) {
        this.chefName=chefName;
    }

    @Override
    public String getChefName() {
        this.setChefName("John");
        return this.chefName;
    }

    @Override
    protected void setPrice(String price) {
        this.price=price;
    }

    @Override
    public String getPrice() {
        this.setPrice("16");
        return this.price;
    }

    @Override
    public void producing() {
        System.out.println("亚洲团队正在制作亚洲风格运动员餐...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
