package by.kapitonov.patterns.creational.factory.abstruct;

public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Gav";
    }
}
