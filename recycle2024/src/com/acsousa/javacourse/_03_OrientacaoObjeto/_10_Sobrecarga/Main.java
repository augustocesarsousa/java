package com.acsousa.javacourse._03_OrientacaoObjeto._10_Sobrecarga;

public class Main {

  public static void main(String[] args) {

    int numeroInteiro1 = (int) (Math.random() * 100);
    int numeroInteiro2 = (int) (Math.random() * 100);
    int numeroInteiro3 = (int) (Math.random() * 100);

    double numeroDouble1 = Math.random() * 100;
    double numeroDouble2 = Math.random() * 100;

    // Chamando os métodos com sobrecarga
    System.out.printf("Soma %d + %d = %d%n",
      numeroInteiro1,
      numeroInteiro2,
      Soma.calcular(numeroInteiro1, numeroInteiro2));

    System.out.printf("Soma %d + %d + %d = %d%n",
      numeroInteiro1,
      numeroInteiro2,
      numeroInteiro3,
      Soma.calcular(numeroInteiro1, numeroInteiro2, numeroInteiro3));

    System.out.printf("Soma %.2f + %.2f = %.2f",
      numeroDouble1,
      numeroDouble2,
      Soma.calcular(numeroDouble1, numeroDouble2));

  }
}
