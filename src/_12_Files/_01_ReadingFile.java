package _12_Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * _01_ReadingFile
 */
public class _01_ReadingFile {

  public static void main(String[] args) {
    File file = new File("/home/augusto/Documents/test.txt");
    Scanner scanner = null;

    try {
      scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }
  }

}
