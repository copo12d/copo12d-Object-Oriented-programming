package gettersANDsetters;

public class Main {
    public static void main(String[] args) {

        //They help protect object data and add rules of accessing or modifying them.
        //Getters = Methods that make a field READABLE
        //Setters = Methods that make a field WRITEABLE

        Car car = new Car("Charger","yellow",10000);

        car.setColor("Blue");
        car.setPrice(-5000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
