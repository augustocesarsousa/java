package com.acsousa.javacourse._05_classesAndMethods;

import java.util.Scanner;

import com.acsousa.javacourse._05_classesAndMethods.entities.Triangle;

public class _01_Class {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Triangle x, y;
    x = new Triangle();
    y = new Triangle();

    System.out.println("Enter the measures of triangle X: ");
    x.a = scanner.nextDouble();
    x.b = scanner.nextDouble();
    x.c = scanner.nextDouble();

    System.out.println("Enter the measures of triangle Y: ");
    y.a = scanner.nextDouble();
    y.b = scanner.nextDouble();
    y.c = scanner.nextDouble();

    double p = (x.a + x.b + x.c) / 2.0;
    double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

    p = (y.a + y.b + y.c) / 2.0;
    double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

    System.out.printf("Triangle X area: %.4f \n", areaX);
    System.out.printf("Triangle Y area: %.4f \n", areaY);

    if (areaX > areaY) {
      System.out.println("Larguer area is X");
    } else {
      System.out.println("Larguer area is Y");
    }

    scanner.close();
  }
}
