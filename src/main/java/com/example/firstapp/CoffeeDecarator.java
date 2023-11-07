package com.example.firstapp;
public class CoffeeDecarator implements Coffee{
    protected Coffee coffeeDecorator;
    public CoffeeDecarator(Coffee coffeeDecorated){
        this.coffeeDecorator = coffeeDecorated;
    }

    public String getDescription(){
        return coffeeDecorator.getDescription();
    }

    public double cost(){
        return coffeeDecorator.cost();
    }
}
