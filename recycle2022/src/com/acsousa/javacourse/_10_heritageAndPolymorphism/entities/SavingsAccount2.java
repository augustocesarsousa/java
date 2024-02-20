package com.acsousa.javacourse._10_heritageAndPolymorphism.entities;

/**
 * SavingsAccount
 */
public class SavingsAccount2 extends AbstractAccount {

  private Double interestRate;

  public SavingsAccount2() {
    super();
  }

  public SavingsAccount2(
      Integer number,
      String holder,
      Double balance,
      Double interestRate) {
    super(number, holder, balance);
    this.interestRate = interestRate;
  }

  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public void updateBalance() {
    balance += balance * interestRate;
  }

  @Override
  public void withdraw(double amount) {
    balance -= amount;
  }

  @Override
  public String toString() {
    return ("SavingsAccount [number = " +
        getNumber() +
        ", holder = " +
        getHolder() +
        ", balance = " +
        balance +
        ", interestRate = " +
        interestRate +
        "]");
  }
}
