/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Shop {
    private Chef chef;
    private Cashier cashier;

    public Shop() {
        this.chef = new Chef();
        this.cashier = new Cashier(chef);
    }

    public void receiveOrder(String pizzaType) {
        System.out.println("Shop received order for " + pizzaType + " pizza.");
        cashier.takeOrder(pizzaType);
    }


    public Cashier getCashier() {
        return this.cashier;
    }

    public Chef getChef() {
        return this.chef;
    }

    public void handleCustomerComplaint(String complaint) {
        System.out.println("Forwarding complaint to cashier...");
        cashier.calmCustomerDown();
    }
}
