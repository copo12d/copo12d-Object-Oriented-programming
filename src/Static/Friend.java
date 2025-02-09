package Static;

public class Friend {
    static int numOFFriends;
    String name;

    Friend(String name){
        this.name = name;
        numOFFriends++;
    }
    static void showFriends(){
        System.out.println("you have " + numOFFriends + " friends");
    }
}
