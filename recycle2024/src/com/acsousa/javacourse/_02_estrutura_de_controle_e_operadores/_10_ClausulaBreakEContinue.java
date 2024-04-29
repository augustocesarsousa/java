package com.acsousa.javacourse._02_estrutura_de_controle_e_operadores;

public class _10_ClausulaBreakEContinue {

  public static void main(String[] args) {

    /*
      As clausulas Break e Continue servem para controlar o fluxo de um loop
      Break: usado para parar o fluxo e sair do loop
      Continue: usado para pular para a próxima iteração do loop
     */

    // Declaração de variáveis para teste
    int numero = 0;

    // Testes
    System.out.printf("Break:%n%n");
    for (int i = 0; i < 10; i++) {
      if (i == 7) {
        break;
      }

      System.out.println("3 x " + i + " = " + (3 * i));
    }

    System.out.printf("%nContinue:%n%n");

    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        continue;
      }

      System.out.println("3 x " + i + " = " + (3 * i));
    }
  }
}
