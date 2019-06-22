package main.behavioral.mediator;

/**
 * Created by Sara on 10/1/2017.
 */
public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);

}
