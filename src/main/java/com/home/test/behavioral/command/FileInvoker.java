package main.behavioral.command;

/**
 * Created by Sara on 10/2/2017.
 */
public class FileInvoker {

    public Command command;

    public FileInvoker(Command c) {
        this.command = c;
    }

    public void execute() {
        this.command.execute();
    }
}
