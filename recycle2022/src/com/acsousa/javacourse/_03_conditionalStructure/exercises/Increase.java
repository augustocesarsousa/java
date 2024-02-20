package com.acsousa.javacourse._03_conditionalStructure.exercises;

import java.util.Scanner;

public class Increase {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double salary, increase;
    int percentage;

    System.out.println("Enter your salary:");
    salary = scanner.nextDouble();

    if (salary <= 1000.0) {
      percentage = 20;
      increase = salary / 100 * percentage;
      salary += increase;
    } else if (salary <= 3000.0) {
      percentage = 15;
      increase = salary / 100 * percentage;
      salary += increase;
    } else if (salary <= 8000.0) {
      percentage = 10;
      increase = salary / 100 * percentage;
      salary += increase;
    } else {
      percentage = 5;
      increase = salary / 100 * percentage;
      salary += increase;
    }

    System.out.printf("Your new salary is $ %.2f\n", salary);
    System.out.printf("Increase = %.2f\n", increase);
    System.out.printf("Percentage = %d %%\n", percentage);

    scanner.close();

  }
}
