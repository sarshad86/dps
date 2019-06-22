package main.behavioral.template;

/**
 * Created by Sara on 10/1/2017.
 */
public class HousingClient {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        //using template method
        houseType.buildHouse();
        System.out.println("************");
        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
