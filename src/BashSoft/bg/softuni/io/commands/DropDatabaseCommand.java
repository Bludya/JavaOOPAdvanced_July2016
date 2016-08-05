package BashSoft.bg.softuni.io.commands;

import BashSoft.bg.softuni.annotations.Alias;
import BashSoft.bg.softuni.annotations.Inject;
import BashSoft.bg.softuni.contracts.Database;
import BashSoft.bg.softuni.exceptions.InvalidInputException;
import BashSoft.bg.softuni.io.OutputWriter;

@Alias("dropdb")
public class DropDatabaseCommand extends Command {

    @Inject
    private Database repository;

    public DropDatabaseCommand(String input,
                               String[] data) {
        super(input, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 1) {
            throw new InvalidInputException(this.getInput());
        }

        this.repository.unloadData();
        OutputWriter.writeMessageOnNewLine("Database dropped!");
    }
}
