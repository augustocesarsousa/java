package _10_heritageAndPolymorphism;

import _10_heritageAndPolymorphism.entities.BusinessAccount;

/**
 * _01_Heritage
 */
public class _01_Heritage {

  public static void main(String[] args) {
    BusinessAccount businessAccount = new BusinessAccount(
      2023,
      "Sushi",
      1000.0,
      200.0
    );

    System.out.println(businessAccount);
    System.out.println("Loan of 200.0");

    businessAccount.loan(200.0);
    System.out.println(businessAccount);
  }
}
