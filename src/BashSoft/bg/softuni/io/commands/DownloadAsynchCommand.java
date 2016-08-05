package BashSoft.bg.softuni.io.commands;

import BashSoft.bg.softuni.annotations.Alias;
import BashSoft.bg.softuni.annotations.Inject;
import BashSoft.bg.softuni.contracts.AsynchDownloader;
import BashSoft.bg.softuni.exceptions.InvalidInputException;

@Alias("downloadasynch")
public class DownloadAsynchCommand extends Command {

    @Inject
    private AsynchDownloader downloadManager;

    public DownloadAsynchCommand(String input,
                                 String[] data) {
        super(input, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getInput());
        }

        String fileUrl = data[1];
        this.downloadManager.downloadOnNewThread(fileUrl);
    }
}
