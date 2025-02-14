package Generics;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Generics = A concept where you can write a class , interface, or methods
        //           that is compatible with different data types.
        //           <T,u>  type parameter (placeholder that gets replaced with the real type)
        //           <String,Integer,Boolean,Character...> type argument (specifies the type).

        /*
        ArrayList<String> fruits = new ArrayList<>();


        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

         */

        Box<Double> box = new Box<>();
        Product<String,Double> product1 = new Product<>("apple",0.50);
        Product<String,Integer> product2 = new Product<>("ticket",15);


        //box.setItem("banana");
        //box.setItem(2);
        box.setItem(3.14);
        System.out.println(box.getItem());

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());

    }
}
