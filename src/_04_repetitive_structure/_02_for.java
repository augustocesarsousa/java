package _04_repetitive_structure;

import java.util.Scanner;

public class _02_for {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int number, result;

    System.out.println("Enter a number:");
    number = scanner.nextInt();

    for (int i = 1; i < 11; i++) {
      result = number * i;
      System.out.printf("%d x %d = %d\n", number, i, result);
    }

    scanner.close();

  }

}
