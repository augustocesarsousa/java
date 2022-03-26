package _04_repetitive_structure;

import java.util.Scanner;

public class _01_while {

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
