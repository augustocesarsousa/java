package _03_conditional_structure;

import java.util.Scanner;

public class _05_ternary_operator {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int typedNumber;

    System.out.println("Enter a number:");
    typedNumber = scanner.nextInt();

    System.out.println("The number is " + ((typedNumber % 2 == 0) ? "pair" : "odd"));

    scanner.close();

  }
}
