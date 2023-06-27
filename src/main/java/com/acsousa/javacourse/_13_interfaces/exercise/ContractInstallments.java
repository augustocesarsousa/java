package com.acsousa.javacourse._13_interfaces.exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.acsousa.javacourse._13_interfaces.exercise.entities.Contract;
import com.acsousa.javacourse._13_interfaces.exercise.entities.Installment;
import com.acsousa.javacourse._13_interfaces.exercise.services.ContractService;
import com.acsousa.javacourse._13_interfaces.exercise.services.PaypalService;

/**
 * ContractInstallments
 */
public class ContractInstallments {

  public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    ContractService contractService = new ContractService(new PaypalService());

    System.out.println("Enter contract data");
    System.out.print("Number: ");
    int number = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Date (dd/MM/yyyy): ");
    Date date = simpleDateFormat.parse(scanner.nextLine());
    System.out.print("Contract value: ");
    Double totalValue = scanner.nextDouble();
    System.out.print("Enter number of installments: ");
    int months = scanner.nextInt();

    Contract contract = new Contract(number, date, totalValue);

    contractService.processContract(contract, months);

    System.out.println();
    System.out.println("Installments:");

    for (Installment installment : contract.getInstallments()) {
      System.out.println(installment);
    }

    scanner.close();
  }
}
