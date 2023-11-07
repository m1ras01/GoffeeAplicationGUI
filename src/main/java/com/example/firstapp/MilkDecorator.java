package com.example.firstapp;
public class MilkDecorator extends CoffeeDecarator{
    public MilkDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",with Milk";
    }

    @Override
    public double cost() {
        return super.cost()+0.5;
    }
}


