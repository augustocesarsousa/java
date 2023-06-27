package com.acsousa.javacourse._15_functionsAndLambda;

import java.util.ArrayList;
import java.util.List;

import com.acsousa.javacourse._15_functionsAndLambda.entities.Product;

/**
 * _03_Consumer
 */
public class _03_Consumer {

  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();

    products.add(new Product("TV", 900.00));
    products.add(new Product("Mouse", 50.00));
    products.add(new Product("Tablet", 450.00));
    products.add(new Product("SSD", 120.00));
    products.add(new Product("Pendrive", 60.00));

    // products.forEach(new PriceUpdate());
    // products.forEach(Product::staticPriceUpdate);
    // products.forEach(Product::nonStaticPriceUpdate);

    // Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
    // products.forEach(cons);

    products.forEach(p -> p.setPrice(p.getPrice() * 1.1));

    products.forEach(System.out::println);
  }
}
