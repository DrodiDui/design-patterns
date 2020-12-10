package by.kapitonov.patterns.creational.singleton;

public class Logger {

    private static Logger instance;

    private Logger(){}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void writeLog(String message) {
        System.out.println(message);
    }

}
