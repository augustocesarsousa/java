package com.acsousa.javacourse._02_estrutura_de_controle_e_operadores;

public class _03_OperadoresLogicos {
  public static void main(String[] args) {
    /*
      A linguagem Java possui dois operadores lógicos, são eles:
          E representado por &&;
          OU representado por ||.
     */

    // Criando variáveis para teste
    int temperatura;
    boolean resultado;

    // Testes
    temperatura = 28;
    resultado = temperatura >= 20 && temperatura <= 30;
    System.out.println("A temperatura está agradável? " + resultado);

    temperatura = 10;
    resultado = temperatura < 20 || temperatura > 30;
    System.out.println("A temperatura está desagradável? " + resultado);

  }
}
