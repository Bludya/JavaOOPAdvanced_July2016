package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.archive.WeaponArchiveImpl;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.commandInterpreter.CommandFactoryImpl;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.*;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.io.ConsoleReader;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.io.ConsoleWriter;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.models.WeponFactoryImpl;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) {
        OutputWriter writer = new ConsoleWriter();
        InputReader reader = new ConsoleReader();
        WeaponArchive archive = new WeaponArchiveImpl();
        WeaponFactory wpnFactory = new WeponFactoryImpl();

        CommandFactory commandFactory = new CommandFactoryImpl(reader, writer, archive, wpnFactory);

        Core core = new Core(commandFactory);
        core.start();
    }
}
