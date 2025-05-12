public class PizzaDecorator implements Pizza {
    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String bePizza() {
        return pizza.bePizza();
    }
}
