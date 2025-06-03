/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Chef {
    private Pizza pizza;
    private boolean busy;
    private int completedOrders;
    private int breaksTaken;
    private boolean kitchenClean;
    private boolean extraCheese;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String tempDiscountCode;
    private String tempOrderNote;

    public Chef() {
        this.pizza = null;
        this.busy = false;
        this.completedOrders = 0;
        this.breaksTaken = 0;
        this.kitchenClean = true;
        this.extraCheese = false;
    }

    public void bakePizza(String pizzaType) {
        System.out.println("Chef is baking " + pizzaType + " pizza.");
        this.pizza = new Pizza("Unknown", "Unknown", pizzaType);
        cutPizzaAndPutInBox();
    }

    public void cutPizzaAndPutInBox() {
        System.out.println("Chef is cutting the " + pizza.getTopping() + " pizza and putting it in a box.");
        deliverPizza();
    }

    public void deliverPizza() {
        System.out.println("Chef is delivering the pizza to the cashier.");
    }

    public void hurryUp() {
        System.out.println("Chef is hurrying up.");
    }

    public void cleanKitchen() {
        System.out.println("Chef is cleaning the kitchen.");
        this.kitchenClean = true;
    }

    public boolean isBusy() {
        return this.busy;
    }

    
    public void anotherUnusedMethod() {
    }

    public void yetAnotherUnusedMethod() {
    }

    public void longMethod() {
        System.out.println("Chef is handling many tasks in a single method");
        this.bakePizza("Cheese");
        this.cutPizzaAndPutInBox();
        this.deliverPizza();
        this.hurryUp();
        this.cleanKitchen();
        this.updateContactInfo("John", "Doe", "123 Street", "555-5555", "john.doe@example.com");
        this.notifyForPromotion();
        this.notifyForDiscount();
        this.notifyForNewArrivals();
        this.applyDiscount();
        this.applyLoyaltyPoints();
        this.handleComplaint("cold pizza");
        this.askForReceipt();
        this.chainOfMethods();
        this.middlemanMethod();
        this.accessInternalDetails();
    }

    public void orderWithUnnecessaryDetails() {
        System.out.println("Placing a detailed order for pizza with extra cheese and discount code");
        this.bakePizza("Veggie");
        this.applyDiscount();
        this.applyLoyaltyPoints();
    }

    public void duplicateMethod() {
        System.out.println("Chef is making a duplicate order");
        this.bakePizza("Cheese");
        this.bakePizza("Cheese");
    }

    public void chainOfMethods() {
        System.out.println("Chef is initiating a message chain");
        this.cleanKitchen();
    }

    public void middlemanMethod() {
        System.out.println("Chef is calling a middleman method");
        this.middleMethod();
    }

    public void middleMethod() {
        System.out.println("Middleman method delegating to another method");
        this.realMethod();
    }

    public void realMethod() {
        System.out.println("Real method doing the actual work");
    }


    public void refusedBequest() {
    }
}
