package _11_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * _01_tryCatch
 */
public class _01_tryCatch {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      String[] vect = scanner.nextLine().split(" ");
      int position = scanner.nextInt();
      System.out.println(vect[position]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid position!");
    } catch (InputMismatchException e) {
      System.out.println("Invalid input!");
    }

    System.out.println("End of program!");

    scanner.close();
  }
}
