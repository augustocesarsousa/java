package _05_classesAndMethods.exercises;

import java.util.Scanner;

import _05_classesAndMethods.exercises.entities.StudentEntity;

public class Student {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    StudentEntity studentEntity = new StudentEntity();

    System.out.print("Enter student's name: ");
    studentEntity.name = scanner.nextLine();

    System.out.print("Enter first grade: ");
    studentEntity.grade1 = scanner.nextDouble();

    System.out.print("Enter second grade: ");
    studentEntity.grade2 = scanner.nextDouble();

    System.out.print("Enter third grade: ");
    studentEntity.grade3 = scanner.nextDouble();

    System.out.println();
    System.out.printf("Final grade = %.2f\n", studentEntity.finalGrade());

    if (studentEntity.passOrFailed()) {
      System.out.println("Pass");
    } else {
      System.out.println("Failed");
      System.out.printf("Missing %.2f points\n", studentEntity.pointsToPass());
    }

    scanner.close();
  }
}
