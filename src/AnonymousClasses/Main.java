package AnonymousClasses;

public class Main {
    public static void main(String[] args) {
        //Anonymous class = A class doesn't hava a name. Cannot be reused.
        //                  Add custom behavior without having to create a new class
        //                  Often used for one time uses (timerTask, Runnable,callbacks).

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
          @Override
          void speak(){
              System.out.println("Scooby doo says *Ruh Roh*");
          }
        };
        TalkingDog talkingDog = new TalkingDog();
        talkingDog.speak();
        dog1.speak();
        dog2.speak(); 
    }
}
