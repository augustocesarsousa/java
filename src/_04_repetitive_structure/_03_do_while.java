package _04_repetitive_structure;

import java.util.Scanner;

public class _03_do_while {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int number, result, multiplier;

    System.out.println("Enter a number:");
    number = scanner.nextInt();
    multiplier = 0;

    do {
      multiplier += 1;
      result = number * multiplier;
      System.out.printf("%d x %d = %d\n", number, multiplier, result);
    } while (multiplier < 10);

    scanner.close();

  }

}
