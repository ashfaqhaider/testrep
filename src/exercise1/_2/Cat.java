package exercise2._2;

/**
 * Created by Elev1 on 2016-05-31.
 */
public class Cat implements DomesticAnimal {
    @Override
    public void makeSound() {
        System.out.println("Cat is making sound.... meawwwww");
    }

    @Override
    public void feedMe() {
        System.out.println("I am your cat, feed me.... milk");
    }
}
