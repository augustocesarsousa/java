package _06_constructorThisOverheadEncapsulation.exercise;

import java.util.Scanner;

import _06_constructorThisOverheadEncapsulation.exercise.entities.Account;

public class Bank {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Account account;

    System.out.print("Enter account number: ");
    int number = scanner.nextInt();

    System.out.print("Enter account holder: ");
    scanner.nextLine();
    String name = scanner.nextLine();

    System.out.print("Is there an initial deposit (y/n)? ");
    char response = scanner.next().charAt(0);

    if (response == 'y') {
      System.out.print("Enter initial deposit value: ");
      double initialDeposit = scanner.nextDouble();
      account = new Account(number, name, initialDeposit);
    } else {
      account = new Account(number, name);
    }

    System.out.println();
    System.out.println("Account data: ");
    System.out.println(account);

    System.out.println();
    System.out.print("Enter a deposit value: ");
    account.deposit(scanner.nextDouble());
    System.out.println("Updated account data: ");
    System.out.println(account);

    System.out.println();
    System.out.print("Enter a withdraw value: ");
    account.withdraw(scanner.nextDouble());
    System.out.println("Updated account data: ");
    System.out.println(account);

    scanner.close();
  }
}
