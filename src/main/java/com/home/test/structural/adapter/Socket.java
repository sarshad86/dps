package main.structural.adapter;

/**
 * Created by Sara on 9/30/2017.
 */
public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }

}
