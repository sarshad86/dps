package main.behavioral.state;

/**
 * Created by Sara on 10/2/2017.
 */
public class TVStopState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }
}
