package com.acsousa.javacourse._15_functionsAndLambda.util;

import java.util.function.Predicate;

import com.acsousa.javacourse._15_functionsAndLambda.entities.Product;

/**
 * ProductPredicate
 */
public class ProductPredicate implements Predicate<Product> {

  @Override
  public boolean test(Product product) {
    return product.getPrice() >= 150.0;
  }

}
