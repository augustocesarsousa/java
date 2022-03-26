package _03_conditionalStructure;

import java.util.Scanner;

public class _05_TernaryOperator {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int typedNumber;

    System.out.println("Enter a number:");
    typedNumber = scanner.nextInt();

    System.out.println("The number is " + ((typedNumber % 2 == 0) ? "pair" : "odd"));

    scanner.close();

  }
}
