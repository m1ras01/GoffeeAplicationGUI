package com.example.firstapp;
public class Espresso implements CoffeeProduct{

    @Override
    public String getProductName() {
        return "This is a Espresso";
    }

    @Override
    public double getPrice() {
        return 2.5;
    }
}
