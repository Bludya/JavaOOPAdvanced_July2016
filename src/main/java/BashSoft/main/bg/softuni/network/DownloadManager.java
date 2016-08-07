package BashSoft.main.bg.softuni.network;

import BashSoft.main.bg.softuni.contracts.AsynchDownloader;
import BashSoft.main.bg.softuni.exceptions.InvalidPathException;
import BashSoft.main.bg.softuni.io.OutputWriter;
import BashSoft.main.bg.softuni.staticData.SessionData;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class DownloadManager implements AsynchDownloader {

    public void download(String fileUrl) {
        URL url;
        ReadableByteChannel rbc = null;
        FileOutputStream fos = null;

        try {
            if (Thread.currentThread().getName().equals("Main")) {
                OutputWriter.writeMessageOnNewLine("Started downloading..");
            }

            url = new URL(fileUrl);
            rbc = Channels.newChannel(url.openStream());
            String fileName = extractNameOfFile(url.toString());
            File file = new File(SessionData.currentPath + "/" + fileName);
            fos = new FileOutputStream(file);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

            if (Thread.currentThread().getName().equals("Main")) {
                OutputWriter.writeMessageOnNewLine("Download complete.");
            }
        } catch (MalformedURLException e) {
            OutputWriter.displayException(e.getMessage());
        } catch (IOException e) {
            OutputWriter.displayException(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (rbc != null) {
                    try {
                        rbc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void downloadOnNewThread(String fileUrl) {
        Thread thread = new Thread(() -> download(fileUrl));
        thread.setDaemon(false);
        OutputWriter.writeMessageOnNewLine(
                String.format("Worker thread %d started download..", thread.getId()));
        SessionData.threadPool.add(thread);
        thread.start();
    }

    private String extractNameOfFile(String fileUrl)
            throws MalformedURLException {
        int indexOfLastSlash = fileUrl.lastIndexOf('/');
        if (indexOfLastSlash == -1) {
            throw new InvalidPathException();
        }

        return fileUrl.substring(indexOfLastSlash + 1);
    }
}
