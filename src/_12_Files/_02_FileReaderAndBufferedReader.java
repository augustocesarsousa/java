package _12_Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * _02_FileReaderAndBufferedReader
 */
public class _02_FileReaderAndBufferedReader {

  public static void main(String[] args) {
    String path = "/home/augusto/Documents/test.txt";
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;

    try {
      fileReader = new FileReader(path);
      bufferedReader = new BufferedReader(fileReader);

      String line = bufferedReader.readLine();

      while (line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      try {
        if (fileReader != null) {
          fileReader.close();
        }
        if (bufferedReader != null) {
          bufferedReader.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
