package BashSoft.main.bg.softuni;

import BashSoft.main.bg.softuni.contracts.*;
import BashSoft.main.bg.softuni.io.CommandInterpreter;
import BashSoft.main.bg.softuni.io.IOManager;
import BashSoft.main.bg.softuni.io.InputReader;
import BashSoft.main.bg.softuni.io.OutputWriter;
import BashSoft.main.bg.softuni.judge.Tester;
import BashSoft.main.bg.softuni.network.DownloadManager;
import BashSoft.main.bg.softuni.repository.RepositoryFilter;
import BashSoft.main.bg.softuni.repository.RepositorySorter;
import BashSoft.main.bg.softuni.repository.StudentsRepository;

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