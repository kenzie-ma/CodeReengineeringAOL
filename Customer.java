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
        complain("Pizza is cold");
        complain("Pizza is late");
        complain("Wrong pizza delivered");
        complain("Pizza is burnt");
        complain("Too little cheese");
        complain("Pizza is undercooked");
        askForReceipt();
    }

    public void updateContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

   public void updateName(String firstName, String lastName) {
    contactInfo.setFirstName(firstName);
    contactInfo.setLastName(lastName);
}

public void updateAddress(String address) {
    contactInfo.setAddress(address);
}

public void updatePhoneNumber(String phoneNumber) {
    contactInfo.setPhoneNumber(phoneNumber);
}

public void updateEmail(String email) {
    contactInfo.setEmail(email);
}



    
}
