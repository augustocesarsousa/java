package _03_conditional_structure;

import java.util.Scanner;

public class _03_if_else {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int hour;

    System.out.println("What time is it? (24h)");
    hour = scanner.nextInt();

    if (hour < 12) {
      System.out.println("Good morning!");
    } else if (hour < 18) {
      System.out.println("Good afternoon!");
    } else {
      System.out.println("Good night!");
    }

    scanner.close();

  }

}
