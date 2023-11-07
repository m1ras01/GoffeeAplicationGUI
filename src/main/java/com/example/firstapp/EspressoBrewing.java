package com.example.firstapp;
public class EspressoBrewing implements CoffeeBrewingStrategy{
    @Override
    public void brewCoffee(){
        System.out.println("Brewing Americano...");
    }
}
