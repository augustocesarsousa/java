package com.acsousa.javacourse._07_vectorsAndLists;

import java.util.Scanner;

import com.acsousa.javacourse._07_vectorsAndLists.entities.Product;

public class _02_VectorWithObject {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the quantity of products: ");
    int vectorLength = scanner.nextInt();
    Product[] vector = new Product[vectorLength];

    for (int i = 0; i < vector.length; i++) {
      scanner.nextLine();
      System.out.printf("Enter name of product %d: ", i + 1);
      String name = scanner.nextLine();

      System.out.printf("Enter price of product %d: ", i + 1);
      double price = scanner.nextDouble();

      vector[i] = new Product(name, price);
    }

    double sum = 0.0;
    for (int i = 0; i < vector.length; i++) {
      sum += vector[i].getPrice();
    }

    System.out.println();
    System.out.printf("Total value of products = $ %.2f\n", sum);

    scanner.close();
  }
}
