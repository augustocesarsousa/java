package com.acsousa.javacourse._10_heritageAndPolymorphism.entities;

public abstract class AbstractAccount {

  private Integer number;
  private String holder;
  protected Double balance;

  public AbstractAccount() {
  }

  public AbstractAccount(Integer number, String holder, Double balance) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public Double getBalance() {
    return balance;
  }

  public void withdraw(double amount) {
    balance -= amount + 5.0;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  @Override
  public String toString() {
    return ("Account [number = " +
        number +
        ", holder = " +
        holder +
        ", balance = " +
        balance +
        "]");
  }
}
