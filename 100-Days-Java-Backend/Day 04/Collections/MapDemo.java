package Day04;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        // Key value pair | firstName: "John"
        // int -> Integer => Wrapper class [Used where the data is represented in the form of Objects]
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1, "Alice");
        userMap.put(2, "Bob");
        userMap.put(3, "Charlie");

        System.out.println("User with id 2: " + userMap.get(2));

        System.out.println("-- All User --");
        for(Map.Entry<Integer, String> entry : userMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
