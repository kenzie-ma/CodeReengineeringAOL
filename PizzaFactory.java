public class PizzaFactory {
    public static Pizza createPizza(String pizzaType) {
        switch (pizzaType.toLowerCase()) {
            case "cheese":
                return new CheesePizza();
            case "veggie":
                return new VeggiePizza();
            case "tuna":
                return new TunaPizza();
            case "pepperoni":
                return new PepperoniPizza();
            default:
                throw new IllegalArgumentException("Unknown pizza type");
        }
    }
}
