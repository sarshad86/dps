package main.creational.abstractFactory;

/**
 * Created by Sara on 9/30/2017.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
