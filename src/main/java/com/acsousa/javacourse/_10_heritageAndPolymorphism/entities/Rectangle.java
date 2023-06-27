package com.acsousa.javacourse._10_heritageAndPolymorphism.entities;

import com.acsousa.javacourse._10_heritageAndPolymorphism.entities.enums.Color;

/**
 * Rectangle
 */
public class Rectangle extends Shape {

  private Double width;
  private Double height;

  public Rectangle() {
    super();
  }

  public Rectangle(Color color, Double width, Double height) {
    super(color);
    this.width = width;
    this.height = height;
  }

  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  @Override
  public Double area() {
    return width * height;
  }
}
