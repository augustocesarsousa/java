package com.acsousa.javacourse._15_functionsAndLambda.entities;

/**
 * Product
 */
public class Product {

  private String name;
  private Double price;

  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public static boolean staticProductPredicate(Product product) {
    return product.getPrice() >= 150.0;
  }

  public boolean nonStaticProductPredicate() {
    return price >= 150.0;
  }

  public static void staticPriceUpdate(Product product) {
    product.setPrice(product.getPrice() * 1.1);
  }

  public void nonStaticPriceUpdate() {
    price = price * 1.1;
  }

  public static String staticUpperCaseName(Product product) {
    return product.getName().toUpperCase();
  }

  public String nonStaticUpperCaseName() {
    return name.toUpperCase();
  }

  @Override
  public String toString() {
    return "Product [" + name + ", " + String.format("%.2f", price) + "]";
  }
}
