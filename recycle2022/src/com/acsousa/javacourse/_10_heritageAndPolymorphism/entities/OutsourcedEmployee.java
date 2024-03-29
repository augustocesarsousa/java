package com.acsousa.javacourse._10_heritageAndPolymorphism.entities;

/**
 * OutsourcedEmployee
 */
public class OutsourcedEmployee extends Employee {

  private Double additionalCharge;

  public OutsourcedEmployee() {
    super();
  }

  public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
    super(name, hours, valuePerHour);
    this.additionalCharge = additionalCharge;
  }

  public Double getAdditionalCharge() {
    return additionalCharge;
  }

  public void setAdditionalCharge(Double additionalCharge) {
    this.additionalCharge = additionalCharge;
  }

  @Override
  public Double payment() {
    return super.payment() + (additionalCharge * 1.1);
  }

  @Override
  public String toString() {
    return "OutsourcedEmployee ["
        + "name=" + getName()
        + ", hours=" + getHours()
        + ", valuePerHour=" + getValuePerHour()
        + ", additionalCharge=" + additionalCharge + "]";
  }

}
