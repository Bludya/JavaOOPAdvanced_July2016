package Exercise5_ObjectCommunicationsAndEvents.Problem03_DependencyInversionSkeleton.operations;

import Exercise5_ObjectCommunicationsAndEvents.Problem03_DependencyInversionSkeleton.Alias;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class Strategies {
    @Alias('-')
    private SubtractionStrategy subtractionStrategy;
    @Alias('+')
    private AdditionStrategy additionStrategy;
    @Alias('*')
    private MultiplyStrategy multiplyStrtegy;
    @Alias('/')
    private DivideStrategy devideStrateg;
}
