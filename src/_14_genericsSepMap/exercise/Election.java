package _14_genericsSepMap.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Election
 */
public class Election {

    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/augusto/Documents/votes.csv"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(";");
                String key = fields[0];
                int value = Integer.parseInt(fields[1]);

                if (votes.containsKey(key)) {
                    votes.put(key, value + votes.get(key));
                } else {
                    votes.put(key, value);
                }

                line = bufferedReader.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + " = " + votes.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}