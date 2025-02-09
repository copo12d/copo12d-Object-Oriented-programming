package Inheritance;

public class Main {
    public static void main(String[] args) {
        //Inheritance = One class inherits the attributes and methods
        //              from another class
        //              child <- parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();


        System.out.println(dog.isAlive);
        System.out.println(dog.lives);
        System.out.println(cat.isAlive);
        System.out.println(cat.lives);
        System.out.println(plant.isAlive);



        dog.eat();
        dog.speak();
        cat.eat();
        cat.speak();
        plant.photosynthesize();




    }
}
