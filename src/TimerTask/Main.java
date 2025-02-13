package TimerTask;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        //Timer = Class that schedules task at specific times or periodically
        //        Useful for:sending notifications, schedules updates, repetitive actions.

        //TimerTask = Represents te task that will be executed by the timer.
        //            You will extend the TimerTask class to defined your task
        //            Create a subclass of TimerTask and @override run().

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int count = 3;
            @Override
            public void run() {
                System.out.println("Hello");
                count--;
                if(count <= 0){
                    System.out.println("TASK COMPLETE!");
                    timer.cancel();
                }


            }
        };

        //timer.schedule(timerTask,3000);
        timer.schedule(timerTask,3000,1000);

    }
}
