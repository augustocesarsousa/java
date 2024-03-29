package com.acsousa.javacourse._15_functionsAndLambda.service;

import java.util.List;
import java.util.function.Predicate;

import com.acsousa.javacourse._15_functionsAndLambda.entities.Product;

/**
 * ProductService
 */
public class ProductService {

  public double filteredSum(List<Product> list, Predicate<Product> criteria) {
    double sum = 0.0;
    for (Product product : list) {
      if (criteria.test(product)) {
        sum += product.getPrice();
      }
    }
    return sum;
  }
}
