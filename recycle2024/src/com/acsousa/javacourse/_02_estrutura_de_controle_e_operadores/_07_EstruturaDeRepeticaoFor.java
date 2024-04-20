package com.acsousa.javacourse._02_estrutura_de_controle_e_operadores;

public class _07_EstruturaDeRepeticaoFor {

  public static void main(String[] args) {

    /*
      A estrutura de repetição For permite que possamos criar loops de repetição,
      ela é mais utilizada quando sabemos a quantidade de iterações que usaremos
      a assinatura do método é: for(iniciação; condição; incremento ou decremento)
     */

    // Teste
    for (int i = 1; i <= 10; i++) {
      System.out.printf("3 x %d = %d%n", i, (3 * i));
    }
  }
}
