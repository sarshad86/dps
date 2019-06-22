package main.structural.composite;

/**
 * Created by Sara on 10/1/2017.
 */
public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color " + fillColor);
    }
}
