////////// exercise 01 ///////////////////
/*
We have a parent class Animal along with its 3 child classes Dog, Cat, Horse.
The Animal class will have as attributes the name, food, age and breed of the animal.
Animal.
Create a method in the Animal class through which each child class should
then display a message on the screen informing that it is fed. generate
a Main class that does the following:
(example)
 */


package exercise_01;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Stich","meat",15,"Doberman");
        dog.feed();
        Animal dog1 = new Dog("Teddy","croquettes",10,"Chihuahua");
        dog1.feed();
        Animal cat = new Cat("Pelusa","cookies",15,"Siames");
        cat.feed();
        Animal horse = new Horse("Spark","grass",25,"Fino");
        horse.feed();

    }
}
