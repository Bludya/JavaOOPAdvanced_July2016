package Exercise6_Reflection.Problem03_04_Barracks.core.factories;

import Exercise6_Reflection.Problem03_04_Barracks.annotations.Inject;
import Exercise6_Reflection.Problem03_04_Barracks.contracts.CommandInterpreter;
import Exercise6_Reflection.Problem03_04_Barracks.contracts.Executable;
import Exercise6_Reflection.Problem03_04_Barracks.contracts.Repository;
import Exercise6_Reflection.Problem03_04_Barracks.contracts.UnitFactory;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class CommandInterpreterImpl implements CommandInterpreter {
    private static final String PATH_TO_COMMANDS =
            "src" + File.separator +
                    "Exercise6_Reflection" + File.separator +
                    "Problem03_04_Barracks" + File.separator +
                    "core" + File.separator +
                    "commands";

    private static final String COMMANDS_PACKAGE =
            "Exercise6_Reflection.Problem03_04_Barracks.core.commands.";

    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {
        Executable command = null;
        try {
            String firstChar = "" + commandName.toUpperCase().charAt(0);
            String commandType = firstChar + commandName.substring(1) + "Command";
            Class<Executable> exeClass = (Class<Executable>) Class.forName(COMMANDS_PACKAGE + commandType);
            Constructor ctor = exeClass.getConstructor(String[].class);
            command = (Executable) ctor.newInstance((Object) data);
            this.injectDependancies(command, exeClass);
        } catch (ReflectiveOperationException roe) {
            System.out.println("No such command!");
        }

        return command;
    }

    private void injectDependancies(Executable command, Class<Executable> exeClass) throws ReflectiveOperationException {
        Field[] classFields = exeClass.getDeclaredFields();
        for (Field classField : classFields) {
            if (!classField.isAnnotationPresent(Inject.class)) {
                continue;
            }

            classField.setAccessible(true);

            Field[] thisFields = this.getClass().getDeclaredFields();
            for (Field thisField : thisFields) {
                if (!classField.getType().equals(thisField.getType())) {
                    continue;
                }

                thisField.setAccessible(true);
                classField.set(command, thisField.get(this));
            }
        }
    }
}
