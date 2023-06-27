package com.acsousa.javacourse._15_functionsAndLambda;

import java.util.ArrayList;
import java.util.List;

import com.acsousa.javacourse._15_functionsAndLambda.entities.Product;

/**
 * _01_Comparator
 */
public class _01_ComparatorWithLambda {

  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();

    products.add(new Product("TV", 900.00));
    products.add(new Product("Notebook", 1200.00));
    products.add(new Product("Tablet", 450.00));

    products.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

    for (Product product : products) {
      System.out.println(product);
    }
  }
}
