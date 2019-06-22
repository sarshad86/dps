package main.creational.singletone;

/**
 * Created by Sara on 9/30/2017.
 */
public class BillPughSingleton {

    private BillPughSingleton() {

    }

    private static class SingletonHelper {

        private static final BillPughSingleton INSTANCE = new
                BillPughSingleton();

    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
