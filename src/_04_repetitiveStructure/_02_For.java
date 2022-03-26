package _04_repetitiveStructure;

import java.util.Scanner;

public class _02_For {

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
