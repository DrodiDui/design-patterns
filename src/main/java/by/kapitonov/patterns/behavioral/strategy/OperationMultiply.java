package by.kapitonov.patterns.behavioral.strategy;

public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int firstVal, int secondVal) {
        return firstVal * secondVal;
    }

}
