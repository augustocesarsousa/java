package _13_interfaces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import _13_interfaces.entities.Employee;

/**
 * InterfaceComparable
 */
public class InterfaceComparable {

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    String path = "/home/augusto/Documents/employee.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();

      while (line != null) {
        String[] emp = line.split(";");
        employees.add(new Employee(emp[0], Double.parseDouble(emp[1])));
        line = br.readLine();
      }

      Collections.sort(employees);

      for (Employee employee : employees) {
        System.out.println(employee.getName() + ";" + employee.getSalary());
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
