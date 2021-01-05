package by.kapitonov.patterns.creational.factory.abstruct;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){

        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }

        return null;
    }
}
