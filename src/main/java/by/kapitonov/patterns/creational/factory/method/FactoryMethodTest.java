package by.kapitonov.patterns.creational.factory.method;

public class FactoryMethodTest {
    public static void main(String[] args) {

        CoffeeShop coffeeShop = new CoffeeShop(new SimpleCoffeeFactory());
        coffeeShop.orderCoffee(CoffeeType.AMERICANO);

    }
}
