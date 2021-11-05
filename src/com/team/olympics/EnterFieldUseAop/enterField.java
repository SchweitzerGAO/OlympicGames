package com.team.olympics.EnterFieldUseAop;

/**
 * @author Gu HungJou
 * @date 2021/11/4 23:01
 * Describe:
 */
public class enterField implements enterFieldInterface{
    @Override
    public String enter(String name) throws Exception {
        System.out.println(name+"自行到达观赛地点...");
       Thread.sleep(2000);
        System.out.println("开始检票...");
        Thread.sleep(2000);
        System.out.println("检票完毕...");
        Thread.sleep(2000);
        return name+"领取观赛凭证...";
    }
}
