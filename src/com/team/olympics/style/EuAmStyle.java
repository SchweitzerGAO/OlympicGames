package com.team.olympics.style;

import com.team.olympics.canteen.Canteen;
import com.team.olympics.detailedMeal.EuAmStyleOlympicMeal;
import com.team.olympics.detailedMeal.EuAmStyleVisitorMeal;
import com.team.olympics.twoKindsMeals.OlympicMeal;
import com.team.olympics.twoKindsMeals.VisitorMeal;

/**
 * @author: Gu HungJou
 * @date: 2021/10/31 20:37
 * Describe:
 */
public class EuAmStyle extends Canteen {

    @Override
    public void setImplementMan() {
        System.out.println("the EuroAndAmericaStyle team manager is Tom");
    }

    @Override
    public OlympicMeal produceOlympicMeal() {
        return new EuAmStyleOlympicMeal();
    }

    @Override
    public VisitorMeal produceVisitorMeal() {
        return new EuAmStyleVisitorMeal();
    }
}
