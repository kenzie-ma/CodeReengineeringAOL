/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Cashier {
    private Chef chef;
    private boolean frequentCustomerDiscount;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String tempDiscountCode;
    private String tempOrderNote;

    public Cashier(Chef chef) {
        this.chef = chef;
        this.frequentCustomerDiscount = false;
    }

    public Chef getChef() {
        return this.chef;
    }

    public void takeOrder(String pizzaType) {
        System.out.println("Cashier is taking order for " + pizzaType + " pizza.");
        this.chef.bakePizza(pizzaType);
    }

    public void hurryUpChef() {
        System.out.println("Cashier is hurrying up the chef.");
        this.chef.hurryUp();
    }

    public void calmCustomerDown() {
        System.out.println("Cashier is calming the customer down.");
        this.chef.cleanKitchen();
    }

    public void deliverPizzaToCustomer() {
        System.out.println("Cashier is delivering pizza to the customer.");
    }

    public void longMethod() {
        takeOrder("Cheese");
        hurryUpChef();
        calmCustomerDown();
        deliverPizzaToCustomer();
    }

    public void duplicateMethod() {
        this.takeOrder("Cheese");
        this.takeOrder("Cheese");
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

    public void applyLoyaltyPoints() {
        System.out.println("Applying loyalty points for customer");
    }

    public void handleComplaint(String complaint) {
        if (complaint.equals("cold pizza")) {
            this.calmCustomerDown();
        } else if (complaint.equals("late delivery")) {
            this.calmCustomerDown();
        } else if (complaint.equals("wrong order")) {
            this.calmCustomerDown();
        } else {
            this.calmCustomerDown();
        }
    }


}
