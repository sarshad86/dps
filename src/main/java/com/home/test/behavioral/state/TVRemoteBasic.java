package main.behavioral.state;

/**
 * Created by Sara on 10/2/2017.
 */
public class TVRemoteBasic {

    private String state = "";

    public static void main(String args[]) {
        TVRemoteBasic remote = new TVRemoteBasic();
        remote.setState("ON");
        remote.doAction();
        remote.setState("OFF");
        remote.doAction();
    }

    public void setState(String state) {
        this.state = state;
    }

    public void doAction() {
        if (state.equalsIgnoreCase("ON")) {
            System.out.println("TV is turned ON");
        } else if (state.equalsIgnoreCase("OFF")) {
            System.out.println("TV is turned OFF");
        }
    }

}
