package com.example.firstapp;
public class ReceivedState implements OrderState{
    @Override
    public void handleState(CoffeeOrder context) {
        System.out.println("Order received. Processing...");
    }
    private void notifyStaff(CoffeeOrder context) {
        System.out.println("Staff notified about the new order. Staff members will be alerted.");
    }

    private void updateDatabase(CoffeeOrder context) {
        // Simulate updating the database with the order information by printing a message
        System.out.println("Order information updated in the database. Database reflects the latest order status.");
    }

}

