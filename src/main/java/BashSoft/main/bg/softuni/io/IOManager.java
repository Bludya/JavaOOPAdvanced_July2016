package BashSoft.main.bg.softuni.io;

import BashSoft.main.bg.softuni.contracts.DirectoryManager;
import BashSoft.main.bg.softuni.exceptions.InvalidFileNameException;
import BashSoft.main.bg.softuni.exceptions.InvalidPathException;
import BashSoft.main.bg.softuni.staticData.SessionData;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class IOManager implements DirectoryManager {
    //in order to work in linux...
    private static final String spliter = File.separator;

    public void traverseDirectory(int depth) {
        Queue<File> subFolders = new LinkedList<>();

        String path = SessionData.currentPath;

        int initialIndentation = path.split(spliter).length;

        File root = new File(path);

        subFolders.add(root);

        while (subFolders.size() != 0) {
            File currentFolder = subFolders.poll();
            int currentIndentation = currentFolder.toString().split(spliter).length - initialIndentation;

            if (depth - currentIndentation < 0) {
                break;
            }

            OutputWriter.writeMessageOnNewLine(currentFolder.toString());

            if (currentFolder.listFiles() != null) {
                for (File file : currentFolder.listFiles()) {
                    if (file.isDirectory()) {
                        subFolders.add(file);
                    } else {
                        int indexOfLastSlash = file.toString().lastIndexOf(spliter);
                        for (int i = 0; i < indexOfLastSlash; i++) {
                            OutputWriter.writeMessage("-");
                        }

                        OutputWriter.writeMessageOnNewLine(file.getName());
                    }
                }
            }
        }
    }

    public void createDirectoryInCurrentFolder(String name) {
        String path = SessionData.currentPath + spliter + name;
        File file = new File(path);
        boolean wasDirMade = file.mkdir();
        if (!wasDirMade) {
            throw new InvalidFileNameException();
        }
    }

    public void changeCurrentDirRelativePath(String relativePath) {
        if (relativePath.equals("..")) {
            // go one directory up
            try {
                String currentPath = SessionData.currentPath;
                int indexOfLastSlash = currentPath.lastIndexOf(spliter);
                String newPath = currentPath.substring(0, indexOfLastSlash);
                SessionData.currentPath = newPath;
            } catch (StringIndexOutOfBoundsException sioobe) {
                throw new InvalidPathException();
            }
        } else {
            // go to a given directory
            String currentPath = SessionData.currentPath;
            currentPath += spliter + relativePath;
            changeCurrentDirAbsolute(currentPath);
        }
    }

    public void changeCurrentDirAbsolute(String absolutePath) {
        File file = new File(absolutePath);
        if (!file.exists()) {
            throw new InvalidPathException();
        }

        SessionData.currentPath = absolutePath;
    }
}

