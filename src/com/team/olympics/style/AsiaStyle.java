package com.team.olympics.style;

import com.team.olympics.canteen.Canteen;
import com.team.olympics.detailedMeal.AsiaStyleOlympicMeal;
import com.team.olympics.detailedMeal.AsiaStyleVisitorMeal;
import com.team.olympics.twoKindsMeals.OlympicMeal;
import com.team.olympics.twoKindsMeals.VisitorMeal;

/**
 * @author: Gu HungJou
 * @date: 2021/10/31 20:38
 * Describe:
 */
public class AsiaStyle extends Canteen {

    @Override
    public void setImplementMan() {
        System.out.println("the AsiaStyle team manager is Nova");
    }

    @Override
    public OlympicMeal produceOlympicMeal() {
        return new AsiaStyleOlympicMeal();
    }

    @Override
    public VisitorMeal produceVisitorMeal() {
        return new AsiaStyleVisitorMeal();
    }
}
