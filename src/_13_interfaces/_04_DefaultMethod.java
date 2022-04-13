package _13_interfaces;

import java.util.Scanner;

import _13_interfaces.services.BrazilInterestService;
import _13_interfaces.services.InterestService;

/**
 * _04_DefaultMethod
 */
public class _04_DefaultMethod {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Amount: ");
    double amount = scanner.nextDouble();
    System.out.print("Months: ");
    int months = scanner.nextInt();

    InterestService interestService = new BrazilInterestService();
    double payment = interestService.payment(amount, months);

    System.out.println("Payment after " + months + " months:");
    System.out.println(String.format("%.2f", payment));

    scanner.close();
  }
}
