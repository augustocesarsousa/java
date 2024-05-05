package com.acsousa.javacourse._02_EstruturaDeControleEOperadores;

public class _04_OperadorCondicionalIfElse {

  public static void main(String[] args) {

    /*
      Em Java os operadores condicionais SE e SENÃO são representados pelos operadores
      IF e ELSE
     */

    // Declaração de variáveis para testes
    int media = (int) (Math.random() * 10);
    int numero = (int) (Math.random() * 10);

    // Testes IF
    if (numero < media) {
      System.out.printf("O número %d é menor que a média!%n", numero);
    }

    if (numero == media) {
      System.out.printf("O número %d é igual a média!%n", numero);
    }

    if (numero > media) {
      System.out.printf("O número %d é meior que a média!%n", numero);
    }

    // Testes IF e ELSE
    media = (int) (Math.random() * 10);
    numero = (int) (Math.random() * 10);

    if (numero < media) {
      System.out.printf("O número %d é menor que a média!%n", numero);
    } else if (numero == media) {
      System.out.printf("O número %d é igual a média!%n", numero);
    } else {
      System.out.printf("O número %d é meior que a média!%n", numero);
    }
  }
}
