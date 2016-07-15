package BashSoft.bg.softuni.io.commands;

import BashSoft.bg.softuni.contracts.*;
import BashSoft.bg.softuni.exceptions.InvalidInputException;
import BashSoft.bg.softuni.judge.Tester;
import BashSoft.bg.softuni.network.DownloadManager;
import BashSoft.bg.softuni.repository.StudentsRepository;

public class ChangeAbsolutePathCommand extends Command {

    public ChangeAbsolutePathCommand(String input,
                                     String[] data,
                                     ContentComparer tester,
                                     Database repository,
                                     AsynchDownloader downloadManager,
                                     DirectoryManager ioManager) {
        super(input, data, tester, repository, downloadManager, ioManager);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getInput());
        }

        String absolutePath = data[1];
        this.getIoManager().changeCurrentDirAbsolute(absolutePath);
    }
}