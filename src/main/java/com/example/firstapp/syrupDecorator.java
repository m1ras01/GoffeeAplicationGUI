package com.example.firstapp;
public class syrupDecorator extends CoffeeDecarator{
    public syrupDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",with Syrup";
    }

    @Override
    public double cost() {
        return super.cost()+0.5;
    }
}
