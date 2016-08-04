package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.commandInterpreter.commands;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.OutputWriter;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.Weapon;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.WeaponArchive;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public class CompareCommand extends CommandImpl {

    public CompareCommand(OutputWriter writer, WeaponArchive archive, String[] commandTexts) {
        super(writer, archive, commandTexts);
    }

    @Override
    public String execute() {
        String firstWeaponName = this.commandTexts[1];
        String secondWeaponName = this.commandTexts[2];

        Weapon firstWeapon = this.archive.getWeapon(firstWeaponName);
        Weapon secondWeapon = this.archive.getWeapon(secondWeaponName);

        int compareResault = firstWeapon.compareTo(secondWeapon);

        if (compareResault >= 0) {
            writer.writeLine(
                    firstWeapon.toString()
                            + String.format(" (Item Level: %.1f)", firstWeapon.calculateLevel()));
        } else {
            writer.writeLine(
                    secondWeapon.toString()
                            + String.format(" (Item Level: %.1f)", secondWeapon.calculateLevel()));
        }
        return "Weapons compared and printed";
    }
}
