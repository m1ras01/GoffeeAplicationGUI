package com.example.firstapp;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        CoffeeBrewingStrategy strategy;
        strategy = new EspressoBrewing();
        strategy.brewCoffee();
        strategy = new AmericanoBrewing();
        strategy.brewCoffee();
        strategy = new CappuccinoBrewing();
        strategy.brewCoffee();


        System.out.println("----------------------------------");

        Coffee coffee = new SimpleCoffee();
        System.out.println("Coffee:" + coffee.getDescription() + " Cost:" + coffee.cost());

        Coffee milkc = new MilkDecorator(coffee);
        System.out.println("Coffee:" + milkc.getDescription() + " Cost:" + milkc.cost());


        System.out.println("----------------------------------------");


        CoffeeOrder coffeeOrder = new CoffeeOrder();
        Scanner scanner = new Scanner(System.in);
        CoffeeOrderObserver barista1 = new Barista("Barista1");
        CoffeeOrderObserver customer = new Customer("ERS");

        InventorManager inventoryManager = InventorManager.getInstance();

        coffeeOrder.addObserver(barista1);
        coffeeOrder.addObserver(customer);


        while (true) {
            System.out.println("\nCoffee Shop Management System:");
            System.out.println("1. Place an Order");
            System.out.println("2. Check Inventory");
            System.out.println("3. UpdateInventory");
            System.out.println("4. Exit");

            System.out.println("Enter your choice:");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    placeOrder(coffeeOrder);
                    break;
                case 2:
                    checkInventor(inventoryManager);
                    break;
                case 3:
                    updateInventory(inventoryManager);
                    break;
                case 4:
                    System.out.println("Thank you for using our coffee shop Management System, GoodBye!!!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice please try again!");
                    //scanner.close();
            }
        }

    }
    private static void checkInventor(InventorManager inventoryManager) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the item to check in inventory: ");
        String item = scanner.nextLine();

        int quantity = inventoryManager.getInventory(item);
        System.out.println("Inventory count for " + item + ": " + quantity);
    }

    private static void updateInventory(InventorManager inventoryManager) {
        Scanner scanner = new Scanner(System.in);
        InventorManager inventorManager = new InventorManager();

        System.out.print("Enter the item to check in inventory: ");
        String item = scanner.nextLine();
        System.out.print("Enter the quantity item : ");
        int quantity = scanner.nextInt();
        inventorManager.updateInventory(item,quantity);

    }
    private static void placeOrder(CoffeeOrder coffeeOrder) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Would you like? Choose!");
            System.out.println("1 - Cappuccino");
            System.out.println("2 - Americano");
            System.out.println("3 - Expresso");
            CoffeeBrewingStrategy strategy;
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    strategy = new CappuccinoBrewing();
                    strategy.brewCoffee();
                    addSomeThing();
                    break;
                case 2:
                    strategy = new AmericanoBrewing();
                    strategy.brewCoffee();
                    addSomeThing();
                    break;
                case 3:
                    strategy = new EspressoBrewing();
                    strategy.brewCoffee();
                    addSomeThing();
                    break;
                default:
                    System.out.println("Please enter correct number!!!");
            }
        }

    }

    private static void addSomeThing() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Would you like to add something? Choose!");
            System.out.println("1 - sugar");
            System.out.println("2 - milk");
            System.out.println("3 - syrup");
            Coffee simpleCoffee = new SimpleCoffee();
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    Coffee sugar = new SugarDecorator(simpleCoffee);
                    System.out.println("Coffee:" + sugar.getDescription() + ". Cost:" + sugar.cost()+"$");
                    updateOrderState(new CoffeeOrder());
                    break;
                case 2:
                    Coffee milk = new MilkDecorator(simpleCoffee);
                    System.out.println("Coffee:" + milk.getDescription() + ". Cost:" + milk.cost()+"$");
                    updateOrderState(new CoffeeOrder());
                    break;
                case 3:
                    Coffee syrup = new syrupDecorator(simpleCoffee);
                    System.out.println("Coffee:" + syrup.getDescription() + ". Cost:" + syrup.cost()+"$");
                    updateOrderState(new CoffeeOrder());
                    break;
                default:
                    System.out.println("please write correct number");

            }
        }
    }
    private static void updateOrderState(CoffeeOrder coffeeOrder) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Update Order State:");
        System.out.println("1. In Progress");
        System.out.println("2. Ready for Pickup");
        System.out.println("3. Completed");

        System.out.print("Enter the new state: ");
        int newStateChoice = scanner.nextInt();

        switch (newStateChoice) {
            case 1:
                coffeeOrder.setOrderState(new InProgressState());
                new InProgressState().handleState(coffeeOrder);
                System.out.println("Please wait!!!");
                updateOrderState(new CoffeeOrder());
            case 2:
                coffeeOrder.setOrderState(new ReadyForPickupState());
                new ReadyForPickupState().handleState(coffeeOrder);
                System.out.println("Enjoy your meal, GoodBye!!!");
                System.exit(0);
            case 3:
                coffeeOrder.setOrderState(new CompletedState());
                new CompletedState().handleState(coffeeOrder);
                System.out.println("Your meal complete, GoodBye!!!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Order state not updated.");

    }
    }
}
