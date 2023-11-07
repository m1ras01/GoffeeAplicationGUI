package com.example.firstapp;
import java.util.ArrayList;
import java.util.List;

public class CoffeeOrder implements CoffeeOrderObservable{
    private List<CoffeeOrderObserver> observers = new ArrayList<>();
    private String currentState;
    public void setOrderState(OrderState state) {
        this.currentState = state.toString();
        notifyObserver(state.getClass().getSimpleName());
    }
    public void placeOrder(String orderDetails) {
        this.currentState = "Received";
        notifyObserver(currentState);
        System.out.println("Order placed: " + orderDetails);
    }

    @Override
    public void addObserver(CoffeeOrderObserver observer){
        observers.add(observer);
    }
    @Override
    public void removeObserver(CoffeeOrderObserver observer){
        observers.remove(observer);
    }
    @Override
    public void notifyObserver(String status){
        for (CoffeeOrderObserver o : observers){
            o.update(status);
        }
    }


}
