package com.acsousa.javacourse._13_interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.acsousa.javacourse._13_interfaces.entities.CarRental;
import com.acsousa.javacourse._13_interfaces.entities.Vehicle;
import com.acsousa.javacourse._13_interfaces.services.BrazilTaxService;
import com.acsousa.javacourse._13_interfaces.services.RentalService;

/**
 * Interface
 */
public class _01_Interface {

  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    System.out.println("Enter rental data");
    System.out.print("Car model: ");
    String carModel = sc.nextLine();
    System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
    Date start = sdf.parse(sc.nextLine());
    System.out.print("Return (dd/MM/yyyy HH:mm): ");
    Date finish = sdf.parse(sc.nextLine());

    CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

    System.out.print("Enter price per hour: ");
    double pricePerHour = sc.nextDouble();
    System.out.print("Enter price per day: ");
    double pricePerDay = sc.nextDouble();

    RentalService rentalService = new RentalService(
        pricePerDay,
        pricePerHour,
        new BrazilTaxService());

    rentalService.processInvoice(cr);

    System.out.println("INVOICE:");
    System.out.println(
        "Basic payment: " +
            String.format("%.2f", cr.getInvoice().getBasicPayment()));
    System.out.println(
        "Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
    System.out.println(
        "Total payment: " +
            String.format("%.2f", cr.getInvoice().getTotalPayment()));

    sc.close();
  }
}
