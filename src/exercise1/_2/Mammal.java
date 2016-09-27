package exercise2._2;

/**
 * Created by Elev1 on 2016-05-31.
 */
public abstract class Mammal implements Animal {

    String sound = "Raaaaaw";
    @Override
    public void makeSound() {
        System.out.println("All mammals make sound ..... ");
    }
}
