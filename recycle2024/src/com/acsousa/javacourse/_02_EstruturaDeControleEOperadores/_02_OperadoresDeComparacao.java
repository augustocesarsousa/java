package com.acsousa.javacourse._02_EstruturaDeControleEOperadores;

public class _02_OperadoresDeComparacao {
  public static void main(String[] args) {

    /*
      Podemos fazer comparação de dados em Java com os seguintes comparadores:
      Maior que >
      Meior ou igual >=
      Menor que <
      Menor ou igual <=
     */

    // Declarando variáveis de teste
    int numero1 = 10;
    int numero2 = 10;
    int numero3 = 11;
    boolean resultado;

    // Comparações
    resultado = numero1 > numero2;
    System.out.printf("%d é maior que %d? %b%n", numero1, numero2, resultado);

    resultado = numero1 >= numero2;
    System.out.printf("%d é maior ou igual à %d? %b%n", numero1, numero2, resultado);

    resultado = numero1 < numero2;
    System.out.printf("%d é menor que %d? %b%n", numero1, numero2, resultado);

    resultado = numero1 <= numero2;
    System.out.printf("%d é menor ou igual à %d? %b%n", numero1, numero2, resultado);

    resultado = numero1 > numero3;
    System.out.printf("%d é maior que %d? %b%n", numero1, numero3, resultado);

    resultado = numero1 >= numero3;
    System.out.printf("%d é maior ou igual à %d? %b%n", numero1, numero3, resultado);

    resultado = numero1 < numero3;
    System.out.printf("%d é menor que %d? %b%n", numero1, numero3, resultado);

    resultado = numero1 <= numero3;
    System.out.printf("%d é menor ou igual à %d? %b%n", numero1, numero3, resultado);
  }
}
