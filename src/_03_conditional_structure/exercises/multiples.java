package _03_conditional_structure.exercises;

import java.util.Scanner;

public class multiples {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int number1, number2, result;

    System.out.println("Enter first number:");
    number1 = scanner.nextInt();

    System.out.println("Enter second number:");
    number2 = scanner.nextInt();

    result = (number1 > number2) ? number1 % number2 : number2 % number1;

    if (result == 0) {
      System.out.println("The numbers are multiples!");
    } else {
      System.out.println("The number aren't multiples!");
    }

    scanner.close();

  }
}
