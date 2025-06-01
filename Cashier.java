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

    public void askForReceipt() {
        System.out.println("Customer is asking for a receipt.");
    }

    public void anotherUnusedMethod() {
    }

    public void longMethod() {
        System.out.println("Cashier is handling many tasks in a single method");
        this.takeOrder("Cheese");
        this.hurryUpChef();
        this.calmCustomerDown();
        this.deliverPizzaToCustomer();
        this.askForReceipt();
    }

    public void duplicateMethod() {
        this.takeOrder("Cheese");
        this.takeOrder("Cheese");
    }

    public void chainOfMethods() {
        System.out.println("Cashier is initiating a message chain");
        this.chef.cleanKitchen();
    }

    public void middlemanMethod() {
        System.out.println("Cashier is calling a middleman method");
        this.middleMethod();
    }

    public void middleMethod() {
        System.out.println("Middleman method delegating to another method");
        this.realMethod();
    }

    public void realMethod() {
        System.out.println("Real method doing the actual work");
    }

    public void updateContactInfo(String firstName, String lastName, String address, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void updateName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void updateAddress(String address) {
        this.address = address;
    }

    public void updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateEmail(String email) {
        this.email = email;
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

    public void refusedBequest() {
    }

    public void accessInternalDetails() {
        System.out.println("Accessing internal details of Chef: " + chef.isBusy());
    }
}
