import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Car car = new Car();

        /*
         System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.isRunning);
        System.out.println(car.year);
        System.out.println(car.price);
        */
        /*
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        */
        car.drive();
        car.brake();
    }
}
