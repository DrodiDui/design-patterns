package by.kapitonov.patterns.creational.factory.abstruct;

public class AbstractFactoryTest {
    public static void main(String[] args) {

        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("Animal");

        Animal animal = (Animal) abstractFactory.create("Dog");
        System.out.println(animal.getAnimal() + " make " + animal.makeSound());

    }
}
