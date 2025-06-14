/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Cashier {
    private Ordering ordering;
    private CustomerService cs;
    private Notifier notifier;
  
    public Cashier(Chef chef) {
        this.ordering = new Ordering(chef);
        this.cs = new CustomerService();
        this.notifier = new Notifier();
    }

    public void takeOrder(PizzaType pizzaType) {
        ordering.takeOrder(pizzaType);
    }

    public void hurryUpChef() {
        ordering.hurryUpChef();
    }

    public void calmCustomerDown() {
        cs.calmCustomerDown();
    }

    public void deliverPizzaToCustomer() {
        cs.deliverPizzaToCustomer();
    }

     public void notifyForPromotion() {
        notifier.notifyCustomer("promotion");
    }

    public void notifyForDiscount() {
        notifier.notifyCustomer("discount");
    }

    public void notifyForNewArrivals() {
        notifier.notifyCustomer("new arrivals");
    }

    public void applyDiscount() {
        notifier.applyDiscount();
    }

    
}
