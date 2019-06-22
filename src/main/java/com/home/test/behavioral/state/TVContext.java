package main.behavioral.state;

/**
 * Created by Sara on 10/2/2017.
 */
public class TVContext implements State {

    private State tvState;

    public State getState() {
        return this.tvState;
    }

    public void setState(State state) {
        this.tvState = state;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
