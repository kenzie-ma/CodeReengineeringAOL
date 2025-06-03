/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Shop {
    private Chef chef;
    private Cashier cashier;
    private Pizza pizza;
    private boolean frequentCustomerDiscount;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String tempDiscountCode;
    private String tempOrderNote;

    public Shop() {
        this.chef = new Chef();
        this.cashier = new Cashier(chef);
        this.frequentCustomerDiscount = false;
    }

    public void receiveOrder(String pizzaType) {
        System.out.println("Shop received order for " + pizzaType + " pizza.");
        this.pizza = createPizza(pizzaType);
        cashier.takeOrder(pizzaType);
    }

    public Pizza createPizza(String pizzaType) {
        switch (pizzaType.toLowerCase()) {
            case "cheese":
                return new CheesePizza();
            case "veggie":
                return new VeggiePizza();
            case "tuna":
                return new TunaPizza();
            case "pepperoni":
                return new PepperoniPizza();
            default:
                throw new IllegalArgumentException("Unknown pizza type");
        }
    }

    public Cashier getCashier() {
        return this.cashier;
    }

    public Chef getChef() {
        return this.chef;
    }

}
