package BashSoft.main.bg.softuni.io.commands;

import BashSoft.main.bg.softuni.annotations.Alias;
import BashSoft.main.bg.softuni.annotations.Inject;
import BashSoft.main.bg.softuni.contracts.Database;
import BashSoft.main.bg.softuni.exceptions.InvalidInputException;

@Alias("readdb")
public class ReadDatabaseCommand extends Command {

    @Inject
    private Database repository;

    public ReadDatabaseCommand(String input,
                               String[] data) {
        super(input, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getInput());
        }

        String fileName = data[1];
        this.repository.loadData(fileName);
    }
}
