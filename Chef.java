/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Chef {
    private Pizza pizza;
    private boolean busy;

    public Chef() {
        this.pizza = null;
        this.busy = false;
    }

    public void bakePizza(PizzaType  pizzaType) {
        System.out.println("Chef is baking " + pizzaType + " pizza.");
        this.pizza = PizzaFactory.createPizza(pizzaType);
        cutPizzaAndPutInBox();
    }

    public void cutPizzaAndPutInBox() {
        System.out.println("Chef is cutting the " + pizza.getTopping() + " pizza and putting it in a box.");
        deliverPizza();
    }

    public void deliverPizza() {
        System.out.println("Chef is delivering the pizza to the cashier.");
    }

    public void hurryUp() {
        System.out.println("Chef is hurrying up.");
    }

    public void cleanKitchen() {
        System.out.println("Chef is cleaning the kitchen.");
    }

    public boolean isBusy() {
        return this.busy;
    }

}
