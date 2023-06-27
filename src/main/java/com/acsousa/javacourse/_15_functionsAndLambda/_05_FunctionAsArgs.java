package com.acsousa.javacourse._15_functionsAndLambda;

import java.util.ArrayList;
import java.util.List;

import com.acsousa.javacourse._15_functionsAndLambda.entities.Product;
import com.acsousa.javacourse._15_functionsAndLambda.service.ProductService;

/**
 * _05_FunctionAsArgs
 */
public class _05_FunctionAsArgs {

  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();

    products.add(new Product("TV", 900.00));
    products.add(new Product("Mouse", 50.00));
    products.add(new Product("Tablet", 450.00));
    products.add(new Product("SSD", 120.00));
    products.add(new Product("Pendrive", 60.00));

    double sum;

    ProductService productService = new ProductService();
    sum = productService.filteredSum(products, p -> p.getName().charAt(0) == 'T');

    System.out.println("Sum = " + String.format("%.2f", sum));
  }
}
