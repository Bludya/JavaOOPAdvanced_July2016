package BashSoft.bg.softuni.io.commands;

import BashSoft.bg.softuni.annotations.Alias;
import BashSoft.bg.softuni.annotations.Inject;
import BashSoft.bg.softuni.contracts.DirectoryManager;
import BashSoft.bg.softuni.exceptions.InvalidInputException;

@Alias("ls")
public class TraverseFoldersCommand extends Command {

    @Inject
    private DirectoryManager ioManager;

    public TraverseFoldersCommand(String input,
                                  String[] data) {
        super(input, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 1 && data.length != 2) {
            throw new InvalidInputException(this.getInput());
        }

        if (data.length == 1) {
            this.ioManager.traverseDirectory(0);
            return;
        }

        this.ioManager.traverseDirectory(Integer.valueOf(data[1]));
    }
}
