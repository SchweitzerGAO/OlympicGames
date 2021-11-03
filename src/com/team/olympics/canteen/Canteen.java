package com.team.olympics.canteen;

import com.team.olympics.detailedMeal.AsiaStyleOlympicMeal;
import com.team.olympics.detailedMeal.AsiaStyleVisitorMeal;
import com.team.olympics.detailedMeal.EuAmStyleOlympicMeal;
import com.team.olympics.detailedMeal.EuAmStyleVisitorMeal;
import com.team.olympics.logisticDepart.logistics;
import com.team.olympics.twoKindsMeals.OlympicMeal;
import com.team.olympics.twoKindsMeals.VisitorMeal;

/**
 * @author Gu HungJou
 * @date 2021/10/31 20:26
 * Describe:
 */
public abstract class Canteen implements logistics {
    @Override
    public void setImplementMan(){}

    public Canteen() {}

    public abstract OlympicMeal produceOlympicMeal();
    public abstract VisitorMeal produceVisitorMeal();

    public static void getCanteenPlot(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("奥运会食堂门口张贴着:");
        System.out.println((new EuAmStyleOlympicMeal()).getName()+"的价格是"+(new EuAmStyleOlympicMeal()).getPrice()+",今日该餐的制作时间是"+(new EuAmStyleOlympicMeal()).getProducedDate());
        System.out.println((new EuAmStyleVisitorMeal()).getName()+"的价格是"+(new EuAmStyleVisitorMeal()).getPrice()+",今日该餐的制作时间是"+(new EuAmStyleVisitorMeal()).getProducedDate());
        System.out.println((new AsiaStyleOlympicMeal()).getName()+"的价格是"+(new AsiaStyleOlympicMeal()).getPrice()+",今日该餐的制作时间是"+(new AsiaStyleOlympicMeal()).getProducedDate());
        System.out.println((new AsiaStyleVisitorMeal()).getName()+"的价格是"+(new AsiaStyleOlympicMeal()).getPrice()+",今日该餐的制作时间是"+(new AsiaStyleOlympicMeal()).getProducedDate());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
