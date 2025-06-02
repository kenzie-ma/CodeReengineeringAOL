/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Customer {
    private Shop pizzaShop;
    private boolean frequentCustomerDiscount;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String tempDiscountCode;
    private String tempOrderNote;

    public Customer(Shop pizzaShop) {
        this.pizzaShop = pizzaShop;
        this.frequentCustomerDiscount = false;
    }

    public void orderPizza(String pizzaType) {
        System.out.println("Customer is placing an order for " + pizzaType + " pizza.");
        this.pizzaShop.receiveOrder(pizzaType);
    }

    public void complain(String complaint) {
        System.out.println("Customer is complaining: " + complaint);
        this.pizzaShop.getCashier().calmCustomerDown();
    }

    public void askForReceipt() {
        System.out.println("Customer is asking for a receipt.");
    }


    public void longComplaintMethod() {
        System.out.println("Customer is complaining about many things");
        this.complain("Pizza is cold");
        this.complain("Pizza is late");
        this.complain("Wrong pizza delivered");
        this.complain("Pizza is burnt");
        this.complain("Too little cheese");
        this.complain("Pizza is undercooked");
        this.askForReceipt();
    }

    public void orderWithUnnecessaryDetails(String pizzaType, String size, String crustType, String toppings, boolean extraCheese, String discountCode) {
        System.out.println("Placing a detailed order for " + pizzaType + " pizza with " + size + ", " + crustType + ", " + toppings + ", extra cheese: " + extraCheese + ", discount code: " + discountCode);
        this.orderPizza(pizzaType);
    }

    public void duplicateComplaint() {
        System.out.println("Customer is complaining about duplicate issues");
        this.complain("Pizza is cold");
        this.complain("Pizza is cold");
        this.complain("Pizza is late");
        this.complain("Pizza is late");
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


    
}
