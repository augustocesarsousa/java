package com.acsousa.javacourse._02_estrutura_de_controle_e_operadores;

public class _08_EstruturaDeRepeticaoWhile {

  public static void main(String[] args) {

    /*
      A estrutura de repetição While permite que possamos criar loops de repetição,
      ela é mais utilizada quando não sabemos a quantidade de iterações que usaremos
      a assinatura do método é: while(condição)
     */

    // Declaração de variáveis para teste
    final int NUMERO_FINAL = 100;
    int numeroInicial = 0;
    int numeroSoma = (int) (Math.random() * 10);

    // Teste
    while (numeroInicial < NUMERO_FINAL) {
      System.out.printf("%d + %d = %d%n", numeroInicial, numeroSoma, (numeroInicial += numeroSoma));
      numeroSoma = (int) (Math.random() * 10);
    }
  }
}
