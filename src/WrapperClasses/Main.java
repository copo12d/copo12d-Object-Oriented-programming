package WrapperClasses;

import Aggregation.Book;

public class Main {
    public static void main(String[] args) {

        //Wrapper Classes = Allow primitive values (int,char,double,boolean)
        //                  to be used as objects. "Wrap them in an object"
        //                  Generally, don't wrap primitives unless you need an object.
        //                  allows use of Collections Framework and static Utility Methods.

        //Autoboxing
        /*
        Integer a = 123;
        Double b = 3.4;
        Character c = '$';
        Boolean d = true;

        //Unboxing
        int x = a;
        double y = b;
        char z = c;
        boolean n = d;
        */

        /*
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        String x = a + b + c + d;

        System.out.println(x);
         */

        /*
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");
         */

        char letter = 'b';


        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));





        

    }
}
