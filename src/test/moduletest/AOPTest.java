package test.moduletest;

import com.team.olympics.EnterFieldUseAop.EnterFieldAOP;
import com.team.olympics.EnterFieldUseAop.enterField;

/**
 * @author: Gu HungJou
 * @date: 2021/11/4 23:23
 * Describe:
 */
public class AOPTest {
    public static void main(String[] args) throws Exception {
        System.out.println("============28.AOP============");
        System.out.println("观众观赛的正常流程是：");
        enterField enterField=new enterField();
        enterField.enter("观众");
        System.out.println();
        System.out.println("但是受严峻的国际疫情影响，主办方临时决定改变进场流程...");
        System.out.println("观众张三对奥运会期待已久，这不，他的心愿马上就要满足了...");
        EnterFieldAOP.enterAOP("张三");
    }

}
