package by.kapitonov.patterns.creational.factory.method;

public class Espresso implements Coffee {
    @Override
    public void grindCoffee() {
        System.out.println("grind coffee");
    }

    @Override
    public void makeCoffee() {
        System.out.println("make espresso");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("pour into cup");
    }
}
