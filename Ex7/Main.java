// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Mushroom(new Chicken(new DefaultPizza()));
        System.out.println(pizza.bePizza());
    }
}