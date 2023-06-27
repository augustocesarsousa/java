package com.acsousa.javacourse._10_heritageAndPolymorphism;

import java.util.ArrayList;
import java.util.List;

import com.acsousa.javacourse._10_heritageAndPolymorphism.entities.AbstractAccount;
import com.acsousa.javacourse._10_heritageAndPolymorphism.entities.BusinessAccount2;
import com.acsousa.javacourse._10_heritageAndPolymorphism.entities.SavingsAccount2;

/**
 * _05_AbstractClass
 */
public class _05_AbstractClass {

  public static void main(String[] args) {
    List<AbstractAccount> accounts = new ArrayList<>();

    accounts.add(new SavingsAccount2(1001, "Sushi", 1000.0, 0.05));
    accounts.add(new SavingsAccount2(1003, "Nino", 300.0, 0.05));
    accounts.add(new BusinessAccount2(1002, "Zeus", 5000.0, 500.0));
    accounts.add(new BusinessAccount2(1004, "Thor", 550.0, 200.0));

    for (AbstractAccount account : accounts) {
      System.out.printf(
          "Balance for account %d = %.2f%n",
          account.getNumber(),
          account.getBalance());
    }

    double sum = 0.0;
    for (AbstractAccount account : accounts) {
      sum += account.getBalance();
    }

    System.out.println();
    System.out.printf("Total balance = %.2f%n", sum);

    for (AbstractAccount account : accounts) {
      account.deposit(10.0);
    }

    System.out.println();
    for (AbstractAccount account : accounts) {
      System.out.printf(
          "New balance for account %d = %.2f%n",
          account.getNumber(),
          account.getBalance());
    }
  }
}
