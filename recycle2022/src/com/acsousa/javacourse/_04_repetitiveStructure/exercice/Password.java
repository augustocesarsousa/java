package com.acsousa.javacourse._04_repetitiveStructure.exercice;

import java.util.Locale;
import java.util.Scanner;

public class Password {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    int password;

    System.out.print("Enter the password: ");
    password = scanner.nextInt();

    while (password != 2002) {
      System.out.print("Invalid password! Try again: ");
      password = scanner.nextInt();
    }

    System.out.println("Access allowed!\n");

    scanner.close();
  }
}
