package BashSoft.bg.softuni;

import BashSoft.bg.softuni.contracts.*;
import BashSoft.bg.softuni.io.CommandInterpreter;
import BashSoft.bg.softuni.io.IOManager;
import BashSoft.bg.softuni.io.InputReader;
import BashSoft.bg.softuni.io.OutputWriter;
import BashSoft.bg.softuni.judge.Tester;
import BashSoft.bg.softuni.network.DownloadManager;
import BashSoft.bg.softuni.repository.RepositoryFilter;
import BashSoft.bg.softuni.repository.RepositorySorter;
import BashSoft.bg.softuni.repository.StudentsRepository;

public class Main {

    public static void main(String[] args) {
        ContentComparer tester = new Tester();
        AsynchDownloader downloadManager = new DownloadManager();
        IOManager ioManager = new IOManager();
        DataSorter sorter = new RepositorySorter();
        DataFilter filter = new RepositoryFilter();
        Database repository = new StudentsRepository(filter, sorter);
        Interpreter currentInterpreter = new CommandInterpreter(
                tester, repository, downloadManager, ioManager);
        Reader reader = new InputReader(currentInterpreter);

        try {
            reader.readCommands();
        } catch (Exception e) {
            OutputWriter.displayException(e.getMessage());
        }
    }
}