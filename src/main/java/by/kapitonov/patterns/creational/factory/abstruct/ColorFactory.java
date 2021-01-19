package by.kapitonov.patterns.creational.factory.abstruct;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String type) {

        if ("Red".equals(type)) {
            return new Red();
        } else if ("Blue".equals(type)) {
            return new Blue();
        }

        return null;
    }
}
