package BashSoft.main.bg.softuni.io.commands;

import BashSoft.main.bg.softuni.annotations.Alias;
import BashSoft.main.bg.softuni.annotations.Inject;
import BashSoft.main.bg.softuni.contracts.AsynchDownloader;
import BashSoft.main.bg.softuni.exceptions.InvalidInputException;

@Alias("download")
public class DownloadFileCommand extends Command {

    @Inject
    private AsynchDownloader downloadManager;

    public DownloadFileCommand(String input, String[] data) {
        super(input, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getInput());
        }

        String fileUrl = data[1];
        this.downloadManager.download(fileUrl);
    }
}
