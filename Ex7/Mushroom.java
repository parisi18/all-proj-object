public class Mushroom extends PizzaDecorator {
    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bePizza() {
        return super.bePizza() + " with mushrooms";
    }
}