package Exercise6_Reflection.Problem03_04_Barracks.core;

import Exercise6_Reflection.Problem03_04_Barracks.contracts.*;
import Exercise6_Reflection.Problem03_04_Barracks.contracts.Runnable;
import Exercise6_Reflection.Problem03_04_Barracks.core.factories.CommandInterpreterImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine implements Runnable {

    private Repository repository;
    private UnitFactory unitFactory;

    public Engine(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        CommandInterpreter interpreter = new CommandInterpreterImpl(
                repository,
                unitFactory);

        while (true) {
            try {
                String input = reader.readLine();
                String[] data = input.split("\\s+");
                String commandName = data[0];

                Executable command = interpreter.interpretCommand(data, commandName);

                String result = command.execute();

                if (result.equals("fight")) {
                    break;
                }

                System.out.println(result);
            } catch (RuntimeException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
