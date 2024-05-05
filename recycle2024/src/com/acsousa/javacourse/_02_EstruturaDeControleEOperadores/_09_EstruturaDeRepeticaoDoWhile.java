package com.acsousa.javacourse._02_EstruturaDeControleEOperadores;

public class _09_EstruturaDeRepeticaoDoWhile {

  public static void main(String[] args) {

    /*
      A estrutura de repetição Do While permite que possamos criar loops de repetição
      onde a condição precise ser executada pelo menos uma vez, mesmo sendo falsa
     */

    // Declaração de variável para teste
    int numero = (int) (Math.random() * 10);

    // Teste
    do {
      System.out.println("Número " + numero + " é par? " + (numero % 2 == 0));
      numero = (int) (Math.random() * 10);
    } while (numero % 2 == 0);
  }
}
