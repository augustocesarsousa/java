package com.acsousa.javacourse._04_repetitiveStructure;

import java.util.Scanner;

public class _01_While {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int number, result, multiplier;

    System.out.println("Enter a number:");
    number = scanner.nextInt();
    multiplier = 1;

    while (multiplier < 11) {
      result = number * multiplier;
      System.out.printf("%d x %d = %d\n", number, multiplier, result);
      multiplier += 1;
    }

    scanner.close();

  }

}
