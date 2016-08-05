package Exercise5_ObjectCommunicationsAndEvents.Problem03_DependencyInversionSkeleton;


import Exercise5_ObjectCommunicationsAndEvents.Problem03_DependencyInversionSkeleton.operations.Calculable;

import java.lang.reflect.Field;

public class PrimitiveCalculator {
    private final String PATH_TO_STRATEGIES = "Exercise5_ObjectCommunicationsAndEvents.Problem03_DependencyInversionSkeleton.operations.Strategies";

    private Calculable strategy;


    public PrimitiveCalculator() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        this.changeStrategy('+');
    }

    public void changeStrategy(char operator) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class strategiesClass = Class.forName(PATH_TO_STRATEGIES);
        Field[] strategies = strategiesClass.getDeclaredFields();
        for (Field strategy : strategies) {
            Alias annotation = strategy.getAnnotation(Alias.class);
            if (annotation.value() == operator) {
                this.strategy = (Calculable) strategy.getType().newInstance();
            }
        }
    }

    public int performCalculation(int firstOperand, int secondOperand) {
        return strategy.calculate(firstOperand, secondOperand);
    }
}
