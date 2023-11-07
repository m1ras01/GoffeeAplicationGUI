package com.example.firstapp;
public class InProgressState implements OrderState{
    @Override
    public void handleState(CoffeeOrder context){
        System.out.println("Order in progress. Brewing coffee...");
        context.setOrderState(new CompletedState());
    }
}
