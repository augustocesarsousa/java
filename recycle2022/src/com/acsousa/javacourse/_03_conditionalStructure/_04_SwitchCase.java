package com.acsousa.javacourse._03_conditionalStructure;

import java.util.Scanner;

public class _04_SwitchCase {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int typedDay;
    String dayOfWeek;

    System.out.println("Enter day of week:");
    typedDay = scanner.nextInt();

    switch (typedDay) {
      case 1:
        dayOfWeek = "Sunday";
        break;
      case 2:
        dayOfWeek = "Monday";
        break;
      case 3:
        dayOfWeek = "Tuesday";
        break;
      case 4:
        dayOfWeek = "Wednesday";
        break;
      case 5:
        dayOfWeek = "Thursday";
        break;
      case 6:
        dayOfWeek = "Friday";
        break;
      case 7:
        dayOfWeek = "Saturday";
        break;
      default:
        dayOfWeek = "(Invalid day)";
        break;
    }

    System.out.println("The day of the week is " + dayOfWeek);

    scanner.close();

  }
}
