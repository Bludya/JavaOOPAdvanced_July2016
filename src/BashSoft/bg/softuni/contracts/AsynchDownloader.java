package BashSoft.bg.softuni.contracts;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public interface AsynchDownloader extends Downloader {
    void downloadOnNewThread(String fileUrl);
}
