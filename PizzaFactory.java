public class PizzaFactory {
    public static Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new CheesePizza();
            case VEGGIE:
                return new VeggiePizza();
            case TUNA:
                return new TunaPizza();
            case PEPPERONI:
                return new PepperoniPizza();
            default:
                throw new IllegalArgumentException("Unknown pizza type");
        }
    }
}
