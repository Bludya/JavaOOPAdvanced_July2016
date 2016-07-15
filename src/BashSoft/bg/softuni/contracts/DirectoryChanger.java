package BashSoft.bg.softuni.contracts;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public interface DirectoryChanger {
    void changeCurrentDirRelativePath(String relativePath);

    void changeCurrentDirAbsolute(String absolutePath);
}
