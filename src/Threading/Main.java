 package Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Threading = Allows a program to run multiple task simultaneously
        //            Helps improve performance with time-consuming operations
        //            (File I/O,network communications, or any background task).

        // How to create a Thread
        // option 1. Extend the thread class (Simpler).
        // option 2. implement the Runnable interface (better).

        Scanner scanner = new Scanner(System.in);
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 10 second to enter your name");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s%n",name);
        scanner.close();
    }
}
