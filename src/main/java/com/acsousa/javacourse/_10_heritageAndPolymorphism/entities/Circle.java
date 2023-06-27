package com.acsousa.javacourse._10_heritageAndPolymorphism.entities;

import com.acsousa.javacourse._10_heritageAndPolymorphism.entities.enums.Color;

/**
 * Circle
 */
public class Circle extends Shape {

  private Double radius;

  public Circle() {
    super();
  }

  public Circle(Color color, Double radius) {
    super(color);
    this.radius = radius;
  }

  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }

  @Override
  public Double area() {
    return Math.PI * radius * radius;
  }
}
