package test.moduletest;

import com.team.olympics.command.ControlCenter;
import com.team.olympics.command.FlagRaiser;
import com.team.olympics.command.Order;
import com.team.olympics.command.OrderCommand;

public class CommandTest {
    public static void main(String[] args) {
        //这里创建2个比赛项目的颁奖典礼的升旗命令

        //乒乓球项目的升旗命令
        Order order1 = new Order();
        order1.setSport("乒乓球");
        order1.setFlag1("中国");
        order1.setFlag2("中国");
        order1.setFlag3("日本");

        //跳水项目的升旗命令
        Order order2 = new Order();
        order2.setSport("跳水");
        order2.setFlag1("中国");
        order2.setFlag2("中国");
        order2.setFlag3("澳大利亚");

        //创建接收者升旗手
        FlagRaiser receiver=new FlagRaiser();

        //把比赛项目和接收者封装成命令对象
        OrderCommand cmd1 = new OrderCommand(receiver, order1);
        OrderCommand cmd2 = new OrderCommand(receiver, order2);

        //创建调用者
        ControlCenter invoker =new ControlCenter();
        invoker.setCommand(cmd1);
        invoker.setCommand(cmd2);
        invoker.orderUp();

    }
}
