package by.kapitonov.patterns.behavioral.strategy;

public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int firstVal, int secondVal) {
        return firstVal + secondVal;
    }

}
