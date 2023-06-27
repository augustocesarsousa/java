package com.acsousa.javacourse._07_vectorsAndLists;

import java.util.Scanner;

public class _01_Vector {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the quantity of heights: ");
    int vectorLength = scanner.nextInt();
    double[] vector = new double[vectorLength];

    for (int i = 0; i < vectorLength; i++) {
      System.out.printf("Enter height %d: ", i + 1);
      vector[i] = scanner.nextDouble();
    }

    double sum = 0.0;
    for (int i = 0; i < vectorLength; i++) {
      sum += vector[i];
    }

    double avg = sum / vectorLength;

    System.out.printf("Avarage height: %.2f\n", avg);

    scanner.close();
  }
}
