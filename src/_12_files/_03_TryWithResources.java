package _12_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * _03_TryWithResources
 */
public class _03_TryWithResources {

  public static void main(String[] args) {
    String path = "/home/augusto/Documents/test.txt";

    try (
      BufferedReader bufferedReader = new BufferedReader(new FileReader(path))
    ) {
      String line = bufferedReader.readLine();

      while (line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
