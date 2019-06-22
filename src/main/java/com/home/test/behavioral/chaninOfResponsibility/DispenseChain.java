package main.behavioral.chaninOfResponsibility;

/**
 * Created by Sara on 10/1/2017.
 */
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);

}
