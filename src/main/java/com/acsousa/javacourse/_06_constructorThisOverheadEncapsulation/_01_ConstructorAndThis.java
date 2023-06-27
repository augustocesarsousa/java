package com.acsousa.javacourse._06_constructorThisOverheadEncapsulation;

import java.util.Scanner;

import com.acsousa.javacourse._06_constructorThisOverheadEncapsulation.entities.Car;

public class _01_ConstructorAndThis {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String name;
    String color;
    double price;

    System.out.print("Car name: ");
    name = scanner.nextLine();

    System.out.print("Car color: ");
    color = scanner.nextLine();

    System.out.print("Car price: ");
    price = scanner.nextDouble();

    Car car = new Car(name, color, price);
    System.out.println(car);
    scanner.close();

  }

}
