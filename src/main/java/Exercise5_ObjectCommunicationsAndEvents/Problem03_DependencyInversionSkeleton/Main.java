package Exercise5_ObjectCommunicationsAndEvents.Problem03_DependencyInversionSkeleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        PrimitiveCalculator calculator = new PrimitiveCalculator();

        while (true) {
            String[] command = reader.readLine().split("\\s+");

            switch (command[0]) {
                case "mode":
                    char mode = command[1].charAt(0);
                    calculator.changeStrategy(mode);
                    break;
                case "End":
                    return;
                default:
                    int firstOperand = Integer.parseInt(command[0]);
                    int secondOperand = Integer.parseInt(command[1]);
                    System.out.println(calculator.performCalculation(firstOperand, secondOperand));
            }
        }
    }
}
