package main.structural.adapter;

/**
 * Created by Sara on 9/30/2017.
 */
public interface SocketAdapter {

    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();

}
