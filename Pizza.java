/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Pizza {
    private String size;
    private String doughType;
    private String topping;
    private boolean extraCheese;
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;
    private String customerPhoneNumber;
    private String customerEmail;
    private String tempDiscountCode;
    private String tempOrderNote;

    public Pizza(String size, String doughType, String topping) {
        this.size = size;
        this.doughType = doughType;
        this.topping = topping;
        this.extraCheese = false;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDoughType(String doughType) {
        this.doughType = doughType;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getSize() {
        return size;
    }

    public String getDoughType() {
        return doughType;
    }

    public String getTopping() {
        return topping;
    }

    public void anotherUnusedMethod() {
    }

    public void yetAnotherUnusedMethod() {
    }

    public void longMethod() {
        System.out.println("Pizza is handling many tasks in a single method");
        this.setSize("Large");
        this.setDoughType("Thin Crust");
        this.setTopping("Pepperoni");
       
    }

    public void orderWithUnnecessaryDetails(String pizzaType, String size, String crustType, String toppings, boolean extraCheese, String discountCode) {
        System.out.println("Placing a detailed order for " + pizzaType + " pizza with " + size + ", " + crustType + ", " + toppings + ", extra cheese: " + extraCheese + ", discount code: " + discountCode);
        this.setSize(size);
        this.setDoughType(crustType);
        this.setTopping(toppings);
        this.applyDiscount();
    }

    public void duplicateMethod() {
        System.out.println("Customer is making a duplicate order");
        this.setTopping("Cheese");
        this.setTopping("Cheese");
    }

    public void chainOfMethods() {
        System.out.println("Pizza is initiating a message chain");
        this.updateCustomerAddress("123 Street");
    }

    public void middlemanMethod() {
        System.out.println("Pizza is calling a middleman method");
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






