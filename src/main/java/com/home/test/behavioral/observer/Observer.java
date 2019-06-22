package main.behavioral.observer;

/**
 * Created by Sara on 10/1/2017.
 */
public interface Observer {

    //method to update the observer, used by subject
    void update();

    //attach with subject to observe
    void setSubject(Subject sub);

}
