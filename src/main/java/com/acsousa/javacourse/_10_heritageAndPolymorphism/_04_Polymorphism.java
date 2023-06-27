package com.acsousa.javacourse._10_heritageAndPolymorphism;

import java.util.Scanner;

import com.acsousa.javacourse._10_heritageAndPolymorphism.entities.Employee;
import com.acsousa.javacourse._10_heritageAndPolymorphism.entities.OutsourcedEmployee;

/**
 * _04_Polymorphism
 */
public class _04_Polymorphism {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of employees: ");
    int numberOfEmployees = scanner.nextInt();
    scanner.nextLine();
    Employee[] employees = new Employee[numberOfEmployees];

    for (int i = 0; i < employees.length; i++) {
      System.out.println();
      System.out.println("Employee #" + (i + 1) + " data:");

      System.out.print("Outsourced (y/n)? ");
      char isOutsourced = scanner.next().charAt(0);
      scanner.nextLine();

      System.out.print("Name: ");
      String name = scanner.nextLine();

      System.out.print("Hours: ");
      int hours = scanner.nextInt();

      System.out.print("Value per hour: ");
      double valuePerHour = scanner.nextDouble();

      if (isOutsourced == 'y') {
        System.out.print("Additional charge: ");
        double additionalCharge = scanner.nextDouble();
        employees[i] = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
      } else {
        employees[i] = new Employee(name, hours, valuePerHour);
      }
    }

    System.out.println();
    System.out.println("Payments: ");
    for (Employee emp : employees) {
      System.out.printf("%s - $ %.2f \n", emp.getName(), emp.payment());
    }

    scanner.close();
  }
}
