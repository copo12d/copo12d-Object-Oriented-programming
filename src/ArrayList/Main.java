package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList = A resizeable array that stores objects (Autoboxing)
        //             Arrays are fixed in size,but ArrayLists can change.

        /*

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Coconut");

        fruits.remove(1);
        fruits.set(0,"Pineapple");
        System.out.println(fruits.get(0));
        System.out.println(fruits.size());
        Collections.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println(list);
        System.out.println(fruits);
         */

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList();

        System.out.print("enter the number you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1;i<=numOfFood;i++){
            System.out.print("Enter food #" + i + " :");
            String food = scanner.nextLine();
            foods.add(food);

        }

        System.out.println(foods);

        scanner.close();

    }
}
