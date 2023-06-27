package com.acsousa.javacourse._06_constructorThisOverheadEncapsulation;

import java.util.Scanner;

import com.acsousa.javacourse._06_constructorThisOverheadEncapsulation.entities.Car3;

public class _03_Encapsulation {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Car3 car = new Car3();

    System.out.print("Car name: ");
    car.setName(scanner.nextLine());

    System.out.print("Car color: ");
    car.setColor(scanner.nextLine());

    System.out.print("Car price: ");
    car.setPrice(scanner.nextDouble());

    System.out.println();
    System.out.println(car.getName() + " - " + car.getColor() + " - " + car.getPrice());
    scanner.close();

  }

}
