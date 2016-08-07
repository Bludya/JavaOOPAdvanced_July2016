package Exercise6_Reflection.Problem03_04_Barracks.core.commands;

import Exercise6_Reflection.Problem03_04_Barracks.contracts.Executable;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public abstract class AbstractCommand implements Executable {
    private String[] data;

    protected AbstractCommand(String[] data) {
        this.data = data;
    }

    protected String[] getData() {
        return data;
    }

}
