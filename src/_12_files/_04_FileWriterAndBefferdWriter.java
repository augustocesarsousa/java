package _12_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * _04_FileWriterAndBefferdWriter
 */
public class _04_FileWriterAndBefferdWriter {

  public static void main(String[] args) {
    String[] names = new String[] { "Sushi", "Zeus", "Thor", "Nino" };
    String path = "/home/augusto/Documents/test2.txt";

    try (
      BufferedWriter bufferedWriter = new BufferedWriter(
        new FileWriter(path, true)
      )
    ) {
      for (String name : names) {
        bufferedWriter.write(name);
        bufferedWriter.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
