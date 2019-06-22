package main.structural.decorator;

/**
 * Created by Sara on 10/1/2017.
 */
public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
