package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.commandInterpreter.commands;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.OutputWriter;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.Weapon;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.WeaponArchive;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.WeaponFactory;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public class CreateCommand extends CommandImpl {
    private WeaponFactory weaponFactory;

    public CreateCommand(OutputWriter writer, WeaponArchive archive, WeaponFactory weaponFactory, String[] commandTexts) {
        super(writer, archive, commandTexts);
        this.setWeaponFactory(weaponFactory);
    }

    private void setWeaponFactory(WeaponFactory weaponFactory) {
        this.weaponFactory = weaponFactory;
    }

    @Override
    public String execute() {
        String typeOfWeapon = this.commandTexts[1];
        String nameOfWeapon = this.commandTexts[2];

        Weapon weapon = weaponFactory.makeWeapon(typeOfWeapon, nameOfWeapon);

        this.archive.addWeapon(weapon);

        return "Weapon added";
    }
}
