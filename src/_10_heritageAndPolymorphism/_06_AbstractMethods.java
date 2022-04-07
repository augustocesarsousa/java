package _10_heritageAndPolymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import _10_heritageAndPolymorphism.entities.Circle;
import _10_heritageAndPolymorphism.entities.Rectangle;
import _10_heritageAndPolymorphism.entities.Shape;
import _10_heritageAndPolymorphism.entities.enums.Color;

/**
 * _06_AbstractMethods
 */
public class _06_AbstractMethods {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Shape> shapes = new ArrayList<>();

    System.out.print("Enter the number os shapes: ");
    int numberOfShapes = scanner.nextInt();
    scanner.nextLine();

    System.out.println();
    for (int i = 0; i < numberOfShapes; i++) {
      System.out.println();
      System.out.printf("Shape #%d data: %n", i + 1);

      System.out.print("Rectangle or Circle (r/c)? ");
      char whichShape = scanner.next().charAt(0);
      scanner.nextLine();

      System.out.print("Color (BLACK/BLUE/RED): ");
      Color color = Color.valueOf(scanner.next());

      if (whichShape == 'r') {
        System.out.print("Width: ");
        double width = scanner.nextDouble();

        System.out.print("height: ");
        double height = scanner.nextDouble();

        shapes.add(new Rectangle(color, width, height));
      } else {
        System.out.print("Radius: ");
        double radius = scanner.nextDouble();

        shapes.add(new Circle(color, radius));
      }
    }

    System.out.println();
    System.out.println("SHAPES: ");
    for (Shape shape : shapes) {
      System.out.println(String.format("%.2f", shape.area()));
    }

    scanner.close();
  }
}
