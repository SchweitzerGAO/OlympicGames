package com.team.olympics.command;

public class OrderCommand implements Command{
    private FlagRaiser receiver;
    private Order order;

    public OrderCommand(FlagRaiser receiver, Order order){
        this.receiver=receiver;
        this.order=order;
    }

    @Override
    public void execute() {

        receiver.raiseflag(order.getSport(),order.getFlag1(), order.getFlag2(),order.getFlag3());

    }
}
