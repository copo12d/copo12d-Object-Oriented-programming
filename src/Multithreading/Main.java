package Multithreading;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Multithreading = Enables a program to run multiple threads concurrently
        //                 (Thread = A set of instructions that run independently)
        //                 Useful for background task or time-consuming operations.

        //MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(new MyRunnable("Ping"));
        Thread thread2 = new Thread(new MyRunnable("Pong"));

        System.out.println("GAME START");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }


        System.out.println("GAME OVER");
    }
}
