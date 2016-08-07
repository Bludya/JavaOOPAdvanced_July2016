package Exercise5_ObjectCommunicationsAndEvents.Problem03_DependencyInversionSkeleton.operations;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class DivideStrategy implements Calculable {
    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand / secondOperand;
    }
}
