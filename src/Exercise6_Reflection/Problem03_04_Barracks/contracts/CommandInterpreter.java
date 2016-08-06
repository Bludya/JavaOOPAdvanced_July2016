package Exercise6_Reflection.Problem03_04_Barracks.contracts;

public interface CommandInterpreter {

    Executable interpretCommand(String[] data, String commandName);
}
