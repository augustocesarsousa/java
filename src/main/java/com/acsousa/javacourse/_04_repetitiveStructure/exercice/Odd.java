package com.acsousa.javacourse._04_repetitiveStructure.exercice;

import java.util.Locale;
import java.util.Scanner;

public class Odd {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    int x;

    System.out.print("Enter the value of X: ");
    x = scanner.nextInt();

    for (int i = 1; i <= x; i++) {
      if (i % 2 != 0) {
        System.out.printf("%d\n", i);
      }
    }

    scanner.close();
  }
}
