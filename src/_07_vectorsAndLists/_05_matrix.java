package _07_vectorsAndLists;

import java.util.Scanner;

/**
 * _05_matrix
 */
public class _05_matrix {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the matrix size: ");
    int number = scanner.nextInt();
    int[][] mat = new int[number][number];

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        System.out.printf("Position [%d-%d]: ", i, j);
        mat[i][j] = scanner.nextInt();
      }
    }

    System.out.println("Main diagonal:");
    for (int i = 0; i < mat.length; i++) {
      System.out.print(mat[i][i] + " ");
    }
    System.out.println();

    int count = 0;
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] < 0) {
          count++;
        }
      }
    }
    System.out.println("Negative numbers = " + count);

    scanner.close();
  }
}
