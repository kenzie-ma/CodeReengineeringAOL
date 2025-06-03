/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Cashier {
    private Chef chef;
  
    public Cashier(Chef chef) {
        this.chef = chef;
    }

    public Chef getChef() {
        return this.chef;
    }

    public void takeOrder(PizzaType  pizzaType) {
        System.out.println("Cashier is taking order for " + pizzaType + " pizza.");
        chef.bakePizza(pizzaType);
    }

    public void hurryUpChef() {
        System.out.println("Cashier is hurrying up the chef.");
        chef.hurryUp();
    }

    public void calmCustomerDown() {
        System.out.println("Cashier is calming the customer down.");
    }

    public void deliverPizzaToCustomer() {
        System.out.println("Cashier is delivering pizza to the customer.");
    }

    public void notifyForPromotion() {
        System.out.println("Notifying customer for promotion");
    }

    public void notifyForDiscount() {
        System.out.println("Notifying customer for discount");
    }

    public void notifyForNewArrivals() {
        System.out.println("Notifying customer for new arrivals");
    }

    public void applyDiscount() {
        System.out.println("Applying discount for customer");
    }

    public void applyLoyaltyPoints(boolean frequentCustomerDiscount) {
        System.out.println("Applying loyalty points for customer");
    }
}
