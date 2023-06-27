package com.acsousa.javacourse._05_classesAndMethods.exercises.entities;

public class StudentEntity {

  public String name;
  public double grade1;
  public double grade2;
  public double grade3;
  public static final double MINIMAL_GRADE = 60.0;

  public double finalGrade() {
    return grade1 + grade2 + grade3;
  }

  public boolean passOrFailed() {
    return finalGrade() > MINIMAL_GRADE ? true : false;
  }

  public double pointsToPass() {
    return MINIMAL_GRADE - finalGrade();
  }

}
