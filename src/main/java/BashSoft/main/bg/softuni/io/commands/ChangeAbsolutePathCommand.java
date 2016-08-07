package BashSoft.main.bg.softuni.io.commands;

import BashSoft.main.bg.softuni.annotations.Alias;
import BashSoft.main.bg.softuni.annotations.Inject;
import BashSoft.main.bg.softuni.contracts.DirectoryManager;
import BashSoft.main.bg.softuni.exceptions.InvalidInputException;

@Alias("cdabs")
public class ChangeAbsolutePathCommand extends Command {

    @Inject
    private DirectoryManager ioManager;

    public ChangeAbsolutePathCommand(String input,
                                     String[] data) {
        super(input, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getInput());
        }

        String absolutePath = data[1];
        this.ioManager.changeCurrentDirAbsolute(absolutePath);
    }
}
