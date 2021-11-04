package com.team.olympics.twoKindsMeals;

import com.team.olympics.product.product;

/**
 * @author: Gu HungJou
 * @date: 2021/10/31 21:05
 * Describe:
 */
public class OlympicMeal extends product{
    public double energy=45;
    public double protein=50;
    public double fat=30;
    public double carbohydrate=5;
    public double sodium=47;

    @Override
    public void packing() {
        System.out.println("These Olympic meals are being packaged...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
