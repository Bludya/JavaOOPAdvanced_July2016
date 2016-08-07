package Exercise5_ObjectCommunicationsAndEvents.Problem03_DependencyInversionSkeleton.operations;

public class SubtractionStrategy implements Calculable {
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }
}
