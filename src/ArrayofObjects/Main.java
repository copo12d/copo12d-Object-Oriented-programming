package ArrayofObjects;

public class Main {
    public static void main (String[] args){

//        Car car1 = new Car("Mustang","Red");
//        Car car2 = new Car("Toyota","Blue");
//        Car car3 = new Car("Charger","yellow");


        // anonymous Objects
        Car[] cars = {new Car("Mustang","Red"),
                new Car("Toyota","Blue"),
                new Car("Charger","yellow")};

        for (Car car : cars) {
            car.color = "Black";

        }
        for (Car car : cars) {
            car.drive();

        }



    }

}
