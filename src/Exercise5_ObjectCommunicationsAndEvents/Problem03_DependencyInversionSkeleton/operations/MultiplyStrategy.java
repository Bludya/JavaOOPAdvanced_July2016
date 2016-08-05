package Exercise5_ObjectCommunicationsAndEvents.Problem03_DependencyInversionSkeleton.operations;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class MultiplyStrategy implements Calculable {
    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }
}
