package com.acsousa.javacourse._10_heritageAndPolymorphism;

import com.acsousa.javacourse._10_heritageAndPolymorphism.entities.Account;
import com.acsousa.javacourse._10_heritageAndPolymorphism.entities.BusinessAccount;
import com.acsousa.javacourse._10_heritageAndPolymorphism.entities.SavingsAccount;

/**
 * _02_UpcastingAndDowncasting
 */
public class _02_UpcastingAndDowncasting {

  public static void main(String[] args) {
    Account account1 = new Account(2000, "Sushi", 0.0);
    BusinessAccount businessAccount = new BusinessAccount(
        2001,
        "Thor",
        0.0,
        200.0);

    // UPCASTING
    Account account2 = businessAccount;
    Account account3 = new BusinessAccount(2002, "Nino", 0.0, 100.0);
    Account account4 = new SavingsAccount(2003, "Fifo", 100.0, 0.05);

    System.out.println("UPCASTING: ");
    System.out.println(account1);
    System.out.println(account2);
    System.out.println(account3);
    System.out.println(account4);

    // DOWNCASTING
    BusinessAccount businessAccount2 = (BusinessAccount) account2;
    businessAccount2.loan(100.0);
    System.out.println(businessAccount2);

    if (account4 instanceof BusinessAccount) {
      BusinessAccount businessAccount3 = (BusinessAccount) account4;
      businessAccount3.loan(200.0);
      System.out.println(businessAccount3);
    }
    if (account4 instanceof SavingsAccount) {
      SavingsAccount savingsAccount = (SavingsAccount) account4;
      savingsAccount.updateBalance();
      System.out.println(savingsAccount);
    }
  }
}
