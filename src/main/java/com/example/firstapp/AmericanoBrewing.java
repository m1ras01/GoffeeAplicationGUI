package com.example.firstapp;
public class AmericanoBrewing implements CoffeeBrewingStrategy{

    @Override
    public void brewCoffee(){
        System.out.println("Brewing Americano...");
    }
}
