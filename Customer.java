/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Customer {
    private Shop pizzaShop;
    private ContactInfo contactInfo;

    public Customer(Shop pizzaShop) {
        this.pizzaShop = pizzaShop;
    }

    public void orderPizza(PizzaType pizzaType) {
        System.out.println("Customer is placing an order for " + pizzaType + " pizza.");
        pizzaShop.receiveOrder(pizzaType);
    }

    public void complain(String complaint) {
        System.out.println("Customer is complaining: " + complaint);
        pizzaShop.calmCustomer(complaint);
    }

    public void askForReceipt() {
        System.out.println("Customer is asking for a receipt.");
    }

    public void updateName(String firstName, String lastName) {
        contactInfo.updateName(firstName, lastName);
    }

    public void updateContact(String firstName, String lastName, String address, String phoneNumber, String email) {
        contactInfo.updateContact(firstName, lastName, address, phoneNumber, email);
    }




    
}
