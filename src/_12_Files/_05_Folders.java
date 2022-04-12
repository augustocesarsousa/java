package _12_Files;

import java.io.File;
import java.util.Scanner;

/**
 * _05_Folders
 */
public class _05_Folders {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a folder path: ");
    String strPath = scanner.nextLine();

    File path = new File(strPath);

    File[] folders = path.listFiles(File::isDirectory);
    System.out.println("FOLDERS:");
    for (File folder : folders) {
      System.out.println(folder);
    }

    File[] files = path.listFiles(File::isFile);
    System.out.println("FOLDERS:");
    for (File file : files) {
      System.out.println(file);
    }

    boolean success = new File(strPath + "/test").mkdir();

    System.out.println("Directiry created successfully: " + success);

    scanner.close();
  }
}
