package com.example.firstapp;
public class CappuccinoBrewing implements CoffeeBrewingStrategy{
    @Override
    public void brewCoffee(){
        System.out.println("Brewing Cappuccino...");
    }
}
