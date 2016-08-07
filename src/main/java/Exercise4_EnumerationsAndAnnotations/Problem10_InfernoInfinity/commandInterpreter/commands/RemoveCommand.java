package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.commandInterpreter.commands;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.OutputWriter;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.WeaponArchive;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public class RemoveCommand extends CommandImpl {
    public RemoveCommand(OutputWriter writer, WeaponArchive archive, String[] commandTexts) {
        super(writer, archive, commandTexts);
    }

    @Override
    public String execute() {
        String nameOfWeapon = this.commandTexts[1];
        int socketIndex = Integer.parseInt(this.commandTexts[2]);

        this.archive.getWeapon(nameOfWeapon).removeGem(socketIndex);
        return "Socket removed";
    }
}
