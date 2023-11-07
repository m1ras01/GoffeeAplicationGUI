package com.example.firstapp;
public class ReadyForPickupState implements OrderState{
    @Override
    public void handleState(CoffeeOrder context){
        System.out.println("Order ready for pickup. Enjoy your coffee!!!");
        context.setOrderState(new CompletedState());
    }
}
