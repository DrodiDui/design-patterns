package by.kapitonov.patterns.creational.singleton;

public class TestSingleton {

    private static final Logger LOGGER = Logger.getInstance();

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            LOGGER.writeLog("i: " + (i + 1));
        }

    }
}
