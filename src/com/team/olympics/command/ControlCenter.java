package com.team.olympics.command;


import java.util.ArrayList;

public class ControlCenter {
    private ArrayList<Command> commands;//可以持有很多的命令对象
    public ControlCenter() {
        commands = new ArrayList<>();
    }
    public void setCommand(Command cmd){
        commands.add(cmd);
    }
    // 发出升旗命令，升旗手开始吊装国旗并执行升旗
    public void orderUp() {
        System.out.println("请升旗手准备悬挂国旗：\n");
        for (Command cmd : commands) {
            if (cmd != null) {
                cmd.execute();
            }
        }
    }
}
