package main.behavioral.command;

/**
 * Created by Sara on 10/2/2017.
 */
public interface FileSystemReceiver {

    void openFile();

    void writeFile();

    void closeFile();
}
