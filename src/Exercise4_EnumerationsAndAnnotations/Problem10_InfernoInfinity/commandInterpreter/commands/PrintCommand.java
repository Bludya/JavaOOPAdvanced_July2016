package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.commandInterpreter.commands;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.OutputWriter;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.WeaponArchive;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public class PrintCommand extends CommandImpl {

    public PrintCommand(OutputWriter writer, WeaponArchive archive, String[] commandTexts) {
        super(writer, archive, commandTexts);
    }

    @Override
    public String execute() {
        String nameOfWeapon = this.commandTexts[1];

        this.writer.writeLine(
                this.archive.getWeapon(nameOfWeapon).toString());

        return "Weapon printed";
    }
}
