package com.example.firstapp;
import java.util.HashMap;
import java.util.Map;

public class InventorManager {
    private static InventorManager instance;
    private Map<String,Integer> inventory;
    protected InventorManager(){
        inventory = new HashMap<>();
    }

    public static InventorManager getInstance(){
        if (instance == null){
            instance = new InventorManager();
        }
        return instance;
    }

    public void updateInventory(String item,int quantity){
        if (inventory.containsKey(item)){
            int currentQuantity = inventory.get(item);
            int newQuantity = currentQuantity + quantity;
            inventory.put(item,newQuantity);
        }else {
            inventory.put(item,quantity);
        }
        System.out.println("Inventory updated: "+item+" quantity: "+quantity);
    }

    public int getInventory(String item){
        return inventory.getOrDefault(item,0);
    }
}
