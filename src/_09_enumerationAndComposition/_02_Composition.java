package _09_enumerationAndComposition;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import _09_enumerationAndComposition.entities.Department;
import _09_enumerationAndComposition.entities.HourContract;
import _09_enumerationAndComposition.entities.Worker;
import _09_enumerationAndComposition.entities.enums.WorkerLevel;

public class _02_Composition {

  public static void main(String[] args) throws ParseException {

    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Enter department's name: ");
    String departmentName = scanner.nextLine();

    System.out.println("Enter worker data: ");
    System.out.print("Name: ");
    String workerName = scanner.nextLine();
    System.out.print("Level: ");
    String workerLevel = scanner.nextLine();
    System.out.print("Base salary: ");
    Double workerBaseSalary = scanner.nextDouble();

    Worker worker = new Worker(
        workerName,
        WorkerLevel.valueOf(workerLevel),
        workerBaseSalary,
        new Department(departmentName));

    System.out.print("How many contracts to this worker? ");
    int numberOfContracts = scanner.nextInt();

    for (int i = 1; i <= numberOfContracts; i++) {
      System.out.println("Enter contract #" + i + " data: ");
      System.out.print("Date (DD/MM/YYYY): ");
      Date contractDate = simpleDateFormat.parse(scanner.next());
      System.out.print("Value per hour: ");
      double valuePerHour = scanner.nextDouble();
      System.out.print("Duration (hours): ");
      int hours = scanner.nextInt();
      HourContract contract = new HourContract(contractDate, valuePerHour, hours);
      worker.addContract(contract);
    }

    System.out.println();
    System.out.print("Enter month and year to calculate income (MM/YYYY): ");
    String monthAndYear = scanner.next();
    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));
    System.out.println("Name: " + worker.getName());
    System.out.println("Department: " + worker.getDepartment().getName());
    System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

    scanner.close();
  }
}
