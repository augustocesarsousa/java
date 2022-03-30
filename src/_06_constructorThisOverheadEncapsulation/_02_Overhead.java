package _06_constructorThisOverheadEncapsulation;

import java.util.Scanner;

import _06_constructorThisOverheadEncapsulation.entities.Car2;

public class _02_Overhead {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String name;
    String color;

    System.out.print("Car name: ");
    name = scanner.nextLine();

    System.out.print("Car color: ");
    color = scanner.nextLine();

    Car2 car = new Car2(name, color);
    System.out.println(car);
    scanner.close();

  }

}
