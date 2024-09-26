// aV 9/26/24
// App.java
// Driver file for the zoo midterm program.

package adam.zoo.com;

public class App {
    public static void main(String[] args) {
        System.out.println("\nWelcome to my Zookeeper's Challenge program!");

        adam.zoo.com.Animal myAnimal = new adam.zoo.com.Animal();
        myAnimal.setAnimalName("My first animal ");
        System.out.println("\nThe name of the new animal is: " + myAnimal.getAnimalName());

        adam.zoo.com.Animal anotherAnimal = new adam.zoo.com.Animal("Zig");
        System.out.println("\nThe name of the second animal is: " + myAnimal.getAnimalName());


        adam.zoo.com.Hyena aNewHyena = new adam.zoo.com.Hyena("Kamari");
        System.out.println("\nThe new Hyena's name is: " + aNewHyena.getAnimalName());

        System.out.println("\nNumber of animals is: " + Animal.numOfAnimal);
    }
}