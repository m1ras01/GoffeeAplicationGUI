package com.example.firstapp;
public class CompletedState implements OrderState{
    @Override
    public void handleState(CoffeeOrder context){
        System.out.println("Order completed, Thank you!!!");
    }
}
