public class Chicken extends PizzaDecorator {
    public Chicken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bePizza() {
        return super.bePizza() + " with chicken";
    }
}