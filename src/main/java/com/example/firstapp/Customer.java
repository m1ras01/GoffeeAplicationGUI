package com.example.firstapp;
public class Customer implements CoffeeOrderObserver {
    private String name;

    public Customer(String name){
        this.name = name;
    }
    @Override
    public void update(String status){
        System.out.println(name+": Order status-"+status);
    }
}
