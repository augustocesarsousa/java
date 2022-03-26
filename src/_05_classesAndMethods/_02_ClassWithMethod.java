package _05_classesAndMethods;

import java.util.Scanner;

import _05_classesAndMethods.entities.TriangleWithMethod;

public class _02_ClassWithMethod {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    TriangleWithMethod x, y;
    x = new TriangleWithMethod();
    y = new TriangleWithMethod();

    System.out.println("Enter the measures of triangle X: ");
    x.a = scanner.nextDouble();
    x.b = scanner.nextDouble();
    x.c = scanner.nextDouble();

    System.out.println("Enter the measures of triangle Y: ");
    y.a = scanner.nextDouble();
    y.b = scanner.nextDouble();
    y.c = scanner.nextDouble();

    double areaX = x.area();
    double areaY = y.area();

    System.out.printf("Triangle X area: %.4f \n", areaX);
    System.out.printf("Triangle Y area: %.4f \n", areaY);

    if (areaX > areaY) {
      System.out.println("Larguer area is X");
    } else {
      System.out.println("Larguer area is Y");
    }

    scanner.close();
  }
}
