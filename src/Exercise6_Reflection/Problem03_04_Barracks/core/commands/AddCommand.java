package Exercise6_Reflection.Problem03_04_Barracks.core.commands;

import Exercise6_Reflection.Problem03_04_Barracks.annotations.Inject;
import Exercise6_Reflection.Problem03_04_Barracks.contracts.Repository;
import Exercise6_Reflection.Problem03_04_Barracks.contracts.Unit;
import Exercise6_Reflection.Problem03_04_Barracks.contracts.UnitFactory;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class AddCommand extends AbstractCommand {

    @Inject
    private Repository unitRepository;
    @Inject
    private UnitFactory unitFactory;

    public AddCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1];
        Unit unitToAdd = this.unitFactory.createUnit(unitType);
        this.unitRepository.addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}
