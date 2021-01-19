package by.kapitonov.patterns.behavioral.strategy;

public class OperationSubstract implements Strategy {

    @Override
    public int doOperation(int firstVal, int secondVal) {
        return firstVal - secondVal;
    }
}
