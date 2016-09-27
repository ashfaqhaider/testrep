package exercise2._2;



/**
 * Created by Elev1 on 2016-05-31.
 */
public class AnimalSimulator {

    public static void main (String [] args){


        Animal[] animals = {new Eagle(), new Goat(), new Peacock(), new Snake(), new Tiger()};
        for (Animal animal: animals) {
            animal.makeSound();
        }

        System.out.println("Domestic animals ....");
        DomesticAnimal[] domesticAnimals = {new Cat()};
        for (DomesticAnimal animal: domesticAnimals) {
            animal.feedMe();
            animal.makeSound();

        }
    }
}
