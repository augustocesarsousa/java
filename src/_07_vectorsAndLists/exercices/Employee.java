package _07_vectorsAndLists.exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import _07_vectorsAndLists.exercices.entities.EmployeeEntity;

public class Employee {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<EmployeeEntity> employees = new ArrayList<>();
    Integer id, employeesRegister;
    String name;
    Double salary;

    System.out.print("How many employees will be registered? ");
    employeesRegister = scanner.nextInt();

    for (int i = 0; i < employeesRegister; i++) {
      System.out.println("Employee #" + (i + 1) + ": ");
      System.out.print("Id: ");
      scanner.nextLine();
      id = scanner.nextInt();
      System.out.print("Name: ");
      scanner.nextLine();
      name = scanner.nextLine();
      System.out.print("Salary: ");
      salary = scanner.nextDouble();
      employees.add(new EmployeeEntity(id, name, salary));
    }

    System.out.println();
    System.out.println("List of employees: ");
    for (EmployeeEntity employee : employees) {
      System.out.println(employee);
    }

    System.out.println();
    System.out.print("Enter the employee id that will have salary increase: ");
    int index = scanner.nextInt();
    EmployeeEntity employee = employees
      .stream()
      .filter(x -> x.getId() == index)
      .findFirst()
      .orElse(null);

    if (employee == null) {
      System.out.println("This id does not exist!");
    } else {
      System.out.print("Enter the percentage: ");
      double percentage = scanner.nextDouble();
      employee.increase(percentage);
    }

    System.out.println();
    System.out.println("Employee with new salary: ");
    System.out.println(employee);

    scanner.close();
  }
}
