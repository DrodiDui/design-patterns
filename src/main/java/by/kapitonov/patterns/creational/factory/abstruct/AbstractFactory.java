package by.kapitonov.patterns.creational.factory.abstruct;

public interface AbstractFactory<T> {

    T create(String type);

}
