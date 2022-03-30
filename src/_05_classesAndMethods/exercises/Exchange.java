package _05_classesAndMethods.exercises;

import java.util.Scanner;

import _05_classesAndMethods.exercises.entities.ExchangeEntity;

public class Exchange {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Double dollarPrice, amount, result;

    System.out.print("What's dollar price? ");
    dollarPrice = scanner.nextDouble();

    System.out.print("How many dollars will be bought? ");
    amount = scanner.nextDouble();

    result = ExchangeEntity.converter(amount, dollarPrice);
    System.out.printf("Value to be paid in reais = %.2f\n", result);

    scanner.close();
  }
}
