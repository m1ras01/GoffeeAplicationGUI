package com.example.firstapp;

import java.util.ArrayList;
import java.util.List;

// Command Interface
interface Command {
    void execute();
}

// Concrete Command - Place Order
class PlaceOrderCommand implements Command {
    private CoffeeOrder order;

    public PlaceOrderCommand(CoffeeOrder order) {
        this.order = order;
    }

    @Override
    public void execute() {

    }
}

// Concrete Command - Cancel Order
class CancelOrderCommand implements Command {
    Item item = new Item();
    private CoffeeOrder order;

    public CancelOrderCommand(CoffeeOrder order) {
        this.order = order;
    }

    @Override
    public void execute() {
        item.cancel();
    }
}

// Concrete Command - Update Inventory
class UpdateInventoryCommand implements Command {
    private Item item;

    public UpdateInventoryCommand(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
         // Logic to update inventory based on item
    }
}

// Invoker (e.g., Waiter, Kitchen, InventoryManager)
class Waiter {
    private List<Command> orders = new ArrayList<>();

    public void takeOrder(Command command) {
        orders.add(command);
        command.execute();
    }
}


class Item {
    private String name;
    private double price;
    private String description;

    public void cancel(){}
    public void place(){}
}


