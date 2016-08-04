package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.CommandFactory;

import java.io.IOException;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public class Core {
    private CommandFactory commandFactory;

    public Core(CommandFactory commandFactory) {
        this.setCommandFactory(commandFactory);
    }

    private void setCommandFactory(CommandFactory commandFactory) {
        this.commandFactory = commandFactory;
    }

    public void start() {
        String commandMessage = "";
        while (!commandMessage.equals("END")) {
            try {
                commandMessage = commandFactory.interpret().execute();
            } catch (IOException ioe) {
                //do nothing
            }
        }
    }
}
