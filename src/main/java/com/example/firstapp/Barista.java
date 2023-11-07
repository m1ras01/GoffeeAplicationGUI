package com.example.firstapp;
public class Barista implements CoffeeOrderObserver{
    private String name;
    public Barista(String name){
        this.name = name;
    }
    @Override
    public void update(String status){
        System.out.println("Name:"+name+": Order status-"+status);
    }
}
