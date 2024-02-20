package com.acsousa.javacourse._15_functionsAndLambda;

import java.util.ArrayList;
import java.util.List;

import com.acsousa.javacourse._15_functionsAndLambda.entities.Product;

/**
 * _02_Predicate
 */
public class _02_Predicate {

  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();

    products.add(new Product("TV", 900.00));
    products.add(new Product("Mouse", 50.00));
    products.add(new Product("Tablet", 450.00));
    products.add(new Product("SSD", 120.00));
    products.add(new Product("Pendrive", 60.00));

    // products.removeIf(new ProductPredicate());
    // products.removeIf(Product::staticProductPredicate);
    // products.removeIf(Product::nonStaticProductPredicate);

    // Predicate<Product> pred = p -> p.getPrice() >= 150.0;
    // products.removeIf(pred);

    products.removeIf(p -> p.getPrice() >= 150.0);

    for (Product product : products) {
      System.out.println(product);
    }
  }
}
