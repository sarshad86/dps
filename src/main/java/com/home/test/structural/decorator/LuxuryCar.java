package main.structural.decorator;

/**
 * Created by Sara on 10/1/2017.
 */
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
