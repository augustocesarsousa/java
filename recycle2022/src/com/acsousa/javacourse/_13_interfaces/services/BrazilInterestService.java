package com.acsousa.javacourse._13_interfaces.services;

/**
 * BrazilInterestService
 */
public class BrazilInterestService implements InterestService {

  private final Double INTEREST_RATE = 0.02;

  @Override
  public double getInterestRate() {
    return INTEREST_RATE;
  }
}
