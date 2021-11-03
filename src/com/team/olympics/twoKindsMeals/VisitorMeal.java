package com.team.olympics.twoKindsMeals;

import com.team.olympics.product.product;

/**
 * @author: Gu HungJou
 * @date: 2021/10/31 21:29
 * Describe:
 */
public class VisitorMeal extends product {
    public double energy=30;
    public double protein=40;
    public double fat=80;
    public double carbohydrate=6;
    public double sodium=47;

    @Override
    public void packing() {
        System.out.println("These Visitor's meals are being packaged...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }


