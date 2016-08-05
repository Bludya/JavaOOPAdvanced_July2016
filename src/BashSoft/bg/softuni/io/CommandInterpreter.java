package BashSoft.bg.softuni.io;

import BashSoft.bg.softuni.annotations.Alias;
import BashSoft.bg.softuni.annotations.Inject;
import BashSoft.bg.softuni.contracts.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class CommandInterpreter implements Interpreter {

    private static final String SEPARATOR = File.separator;
    private static final String COMMAND_PACKAGE = "BashSoft.bg.softuni.io.commands.";
    private static final String COMMANDS_LOCATION =
            "src" + SEPARATOR +
                    "BashSoft" + SEPARATOR +
                    "bg" + SEPARATOR +
                    "softuni" + SEPARATOR +
                    "io" + SEPARATOR +
                    "commands";
    private ContentComparer tester;
    private Database repository;
    private AsynchDownloader downloadManager;
    private DirectoryManager ioManager;

    public CommandInterpreter(ContentComparer tester,
                              Database repository,
                              AsynchDownloader downloadManager,
                              DirectoryManager ioManager) {
        this.tester = tester;
        this.repository = repository;
        this.downloadManager = downloadManager;
        this.ioManager = ioManager;
    }

    public void interpretCommand(String input) throws IOException {
        String[] data = input.split("\\s+");
        String commandName = data[0].toLowerCase();
        try {
            Executable command = parseCommand(input, data, commandName);
            command.execute();
        } catch (Exception ex) {
            OutputWriter.displayException(ex.getMessage());
        }
    }

    private Executable parseCommand(String input, String[] data, String command) {
        File commandFolder = new File(COMMANDS_LOCATION);
        Executable executable = null;
        for (File file : commandFolder.listFiles()) {
            if (!file.isFile() || !file.getName().endsWith(".java")) {
                continue;
            }

            try {
                String className = file.getName().substring(0, file.getName().lastIndexOf("."));
                Class<Executable> exeClass = (Class<Executable>) Class.forName(COMMAND_PACKAGE + className);

                if (!exeClass.isAnnotationPresent(Alias.class)) {
                    continue;
                }

                Alias alias = exeClass.getAnnotation(Alias.class);
                String value = alias.value();
                if (!value.equalsIgnoreCase(command)) {
                    continue;
                }

                Constructor exeCtor = exeClass.getConstructor(String.class, String[].class);
                executable = (Executable) exeCtor.newInstance(input, data);
                this.injectDependancies(executable, exeClass);
            } catch (ReflectiveOperationException roe) {
                roe.printStackTrace();
            }

        }

        return executable;
    }

    private void injectDependancies(Executable executable,
                                    Class<Executable> exeClass) throws ReflectiveOperationException {

        Field[] exeField = exeClass.getDeclaredFields();
        for (Field fieldToSet : exeField) {
            if (!fieldToSet.isAnnotationPresent(Inject.class)) {
                continue;
            }
            fieldToSet.setAccessible(true);

            Field[] theseFields = CommandInterpreter.class.getDeclaredFields();
            for (Field thisField : theseFields) {
                if (!thisField.getType().equals(fieldToSet.getType())) {
                    continue;
                }

                thisField.setAccessible(true);
                fieldToSet.set(executable, thisField.get(this));
            }
        }

    }
}
