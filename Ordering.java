public class Ordering {
    private Chef chef;

    public Ordering(Chef chef) {
        this.chef = chef;
    }

    public void takeOrder(PizzaType pizzaType) {
        System.out.println("Taking order for " + pizzaType + " pizza.");
        chef.bakePizza(pizzaType);
    }

    public void hurryUpChef() {
        System.out.println("Hurrying up the chef.");
        chef.hurryUp();
    }
}
