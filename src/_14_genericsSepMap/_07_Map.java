package _14_genericsSepMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * _07_Map
 */
public class _07_Map {

    public static void main(String[] args) {

        Map<String, String> user = new TreeMap<>();

        user.put("name", "Sushi");
        user.put("phone", "12345678");
        user.put("email", "sushi@gmail.com");

        System.out.println("User Data:");
        print(user);

        System.out.println();
        System.out.println("Remove email:");
        user.remove("email");
        print(user);

        System.out.println();
        System.out.println("Change phone:");
        user.put("phone", "98765432");
        print(user);

        System.out.println();
        System.out.println("Contains 'name' key: " + user.containsKey("name"));
        System.out.println("Contains 'email' key: " + user.containsKey("email"));
        System.out.println("Size: " + user.size());
    }

    public static void print(Map<String, String> user) {
        for (String key : user.keySet()) {
            System.out.println(key + ": " + user.get(key));
        }
    }
}