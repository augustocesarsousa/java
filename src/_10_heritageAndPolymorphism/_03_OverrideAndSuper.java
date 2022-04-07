package _10_heritageAndPolymorphism;

import _10_heritageAndPolymorphism.entities.Account;
import _10_heritageAndPolymorphism.entities.BusinessAccount;
import _10_heritageAndPolymorphism.entities.SavingsAccount;

/**
 * _03_OverrideAndSuper
 */
public class _03_OverrideAndSuper {

  public static void main(String[] args) {
    Account account = new Account(1000, "Sushi", 1000.0);
    account.withdraw(200.0);

    Account account2 = new SavingsAccount(1001, "Thor", 1000.0, 0.05);
    account2.withdraw(200.0);

    Account account3 = new BusinessAccount(1002, "Nino", 1000.0, 200.0);
    account3.withdraw(200.0);

    System.out.println(account);
    System.out.println(account2);
    System.out.println(account3);
  }
}
