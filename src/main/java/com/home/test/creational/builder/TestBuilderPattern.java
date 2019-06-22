package main.creational.builder;

/**
 * Created by Sara on 9/30/2017.
 */
public class TestBuilderPattern {

    public static void main(String[] args) {
//Using builder to get the object in a single line of code and
//without any inconsistent state or arguments management issues

        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
    }

}
