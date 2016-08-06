package Exercise6_Reflection.Problem03_04_Barracks.core.commands;

import Exercise6_Reflection.Problem03_04_Barracks.annotations.Inject;
import Exercise6_Reflection.Problem03_04_Barracks.contracts.Repository;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class RetireCommand extends AbstractCommand {

    @Inject
    private Repository unitRepository;

    public RetireCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1];
        try {
            this.unitRepository.removeUnit(unitType);
        } catch (RuntimeException re) {
            return re.getMessage();
        }
        return unitType + " retired!";
    }
}
