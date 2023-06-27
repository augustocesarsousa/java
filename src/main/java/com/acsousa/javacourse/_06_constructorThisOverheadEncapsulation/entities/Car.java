package com.acsousa.javacourse._06_constructorThisOverheadEncapsulation.entities;

public class Car {

  public String name;
  public String color;
  public double price;

  public Car(String name, String color, double price) {
    this.name = name;
    this.color = color;
    this.price = price;
  }

  @Override
  public String toString() {
    return name
        + ", "
        + color
        + ", $"
        + String.format("%.2f\n", price);
  }
}
