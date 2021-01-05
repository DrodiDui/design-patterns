package by.kapitonov.patterns.creational.factory.method;

public class SimpleCoffeeFactory implements CoffeeFactory {

    private Coffee coffee;

    @Override
    public Coffee create(CoffeeType coffeeType) {

        switch (coffeeType) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            default:
                throw new IllegalArgumentException("Coffee type hasn't been found");
        }

        return coffee;
    }
}
