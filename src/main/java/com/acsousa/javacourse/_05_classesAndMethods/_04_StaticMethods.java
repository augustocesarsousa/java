package com.acsousa.javacourse._05_classesAndMethods;

import java.util.Scanner;

import com.acsousa.javacourse._05_classesAndMethods.utils.Calculator;

public class _04_StaticMethods {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double radius, circumference, volume;

    System.out.print("Enter radius: ");
    radius = scanner.nextDouble();

    circumference = Calculator.circumference(radius);
    volume = Calculator.volume(radius);

    System.out.println();
    System.out.printf("Circumference: %.2f%n", circumference);
    System.out.printf("Volume: %.2f%n", volume);
    System.out.printf("PI value: %.2f%n", Calculator.PI);

    scanner.close();

  }
}
