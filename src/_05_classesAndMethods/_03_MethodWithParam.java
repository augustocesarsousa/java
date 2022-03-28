package _05_classesAndMethods;

import java.util.Scanner;

import _05_classesAndMethods.entities.Product;

public class _03_MethodWithParam {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Product product = new Product();
    int quantity;

    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    product.name = scanner.nextLine();
    System.out.print("Price: ");
    product.price = scanner.nextDouble();
    System.out.print("Quantity: ");
    product.quantity = scanner.nextInt();

    System.out.println();
    System.out.println("Product data: " + product);

    System.out.println();
    System.out.print("Enter the number of products to added in stock: ");
    quantity = scanner.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);

    System.out.println();
    System.out.print("Enter the number of products to be removed from stock: ");
    quantity = scanner.nextInt();
    product.remoteProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);

    scanner.close();
  }
}
