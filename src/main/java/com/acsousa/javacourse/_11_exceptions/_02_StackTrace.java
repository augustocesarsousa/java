package com.acsousa.javacourse._11_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * _02_StackTrace
 */
public class _02_StackTrace {

  public static void main(String[] args) {
    method1();

    System.out.println("End of program!");
  }

  private static void method1() {
    System.out.println("----METHOD 1 START----");
    method2();
    System.out.println("----METHOD 1 END----");
  }

  private static void method2() {
    System.out.println("----METHOD 2 START----");

    Scanner scanner = new Scanner(System.in);

    try {
      String[] vect = scanner.nextLine().split(" ");
      int position = scanner.nextInt();
      System.out.println(vect[position]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid position!");
      e.printStackTrace();
      scanner.next();
    } catch (InputMismatchException e) {
      System.out.println("Invalid input!");
      e.printStackTrace();
      scanner.next();
    }

    scanner.close();

    System.out.println("----METHOD 2 END----");
  }
}
