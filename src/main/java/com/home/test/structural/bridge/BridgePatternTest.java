package main.structural.bridge;

/**
 * Created by Sara on 10/1/2017.
 */
public class BridgePatternTest {

    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();
        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
