package Exercise6_Reflection.Problem03_04_Barracks.core.commands;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class FightCommand extends AbstractCommand {

    public FightCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
