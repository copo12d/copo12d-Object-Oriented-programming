package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //HashMap = A data structure that store key-value pairs
        //          keys are unique,but values can be duplicated
        //          Does not maintain any order,but is memory efficient
        //          HashMap<Key,Value>.

        HashMap<String, Double> map = new HashMap<>();
        map.put("apple",0.50);
        map.put("orange",0.75);
        map.put("banana",0.25);
        map.put("coconut",1.00);

        //map.remove("apple");
        /*
        System.out.println(map.containsKey("banana"));

        System.out.println(map.get("apple"));

        if(map.containsKey("apple")){
            System.out.println(map.get("apple"));
        }else {
            System.out.println("KEY NOT FOUND!");
        }
         */
        System.out.println(map.size());
        System.out.println(map);

        for (String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));

        }

    }
}
