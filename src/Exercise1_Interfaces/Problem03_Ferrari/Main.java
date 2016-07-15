package Exercise1_Interfaces.Problem03_Ferrari;

import Exercise1_Interfaces.Problem03_Ferrari.Interfaces.Car;
import Exercise1_Interfaces.Problem03_Ferrari.models.Ferrari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;

/**
 * Created by bludya on 7/14/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException, IllegalClassFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String driver = reader.readLine();
        Ferrari ferrari = new Ferrari(driver);

        System.out.printf("%s/%s/%s/%s%n", ferrari.getModel(),
                ferrari.useBrakes(),
                ferrari.pushGasPedal(),
                ferrari.getDriver());

        String ferrariName = Ferrari.class.getSimpleName();

        String carInterface = Car.class.getSimpleName();

        boolean isCreated = Car.class.isInterface();

        if (!isCreated) {

            throw new IllegalClassFormatException("No interface created!");

        }
    }
}
