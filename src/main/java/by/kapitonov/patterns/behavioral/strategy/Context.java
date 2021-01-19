package by.kapitonov.patterns.behavioral.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int firstVal, int secondVal) {
        return strategy.doOperation(firstVal, secondVal);
    }
}
