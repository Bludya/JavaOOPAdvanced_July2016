package Exercise6_Reflection.Problem03_04_Barracks.core.commands;

import Exercise6_Reflection.Problem03_04_Barracks.annotations.Inject;
import Exercise6_Reflection.Problem03_04_Barracks.contracts.Repository;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class ReportCommand extends AbstractCommand {

    @Inject
    private Repository unitRepository;

    public ReportCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String output = this.unitRepository.getStatistics();
        return output;
    }
}
