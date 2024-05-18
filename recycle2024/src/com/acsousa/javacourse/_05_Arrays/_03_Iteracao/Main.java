package com.acsousa.javacourse._05_Arrays._03_Iteracao;

public class Main {

  public static void main(String[] args) {

    double[] notas = {9.8, 5.7, 7.4, 8.2, 4.3, 5.5, 10};
    double media = Calculadora.calcularMedia(notas);

    System.out.printf("Média = %.2f", media);

  }
}
