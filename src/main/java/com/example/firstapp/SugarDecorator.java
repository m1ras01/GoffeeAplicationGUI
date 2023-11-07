package com.example.firstapp;
public class SugarDecorator extends CoffeeDecarator{
    public SugarDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",with Sugar";
    }

    @Override
    public double cost() {
        return super.cost()+0.5;
    }
}
