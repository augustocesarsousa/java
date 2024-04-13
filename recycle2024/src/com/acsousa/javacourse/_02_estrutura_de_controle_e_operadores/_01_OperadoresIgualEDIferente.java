package com.acsousa.javacourse._02_estrutura_de_controle_e_operadores;

public class _01_OperadoresIgualEDIferente {
  public static void main(String[] args) {
    /*
      Para fazer comparações de igualdade em Java, utilizamos o operador de igualdade ==
      O resultado a comparação sempre será um booleano
      Não deve ser utilizado para comparar String
      Para fazer comparações de diferença em Java, utilizamos o operador de diferença !=
      Ele segue as mesmas regras do operador de igualdade
     */

    // Declarando variáveis de testes
    int numero1 = 10;
    int numero2 = 10;
    int numero3 = 11;
    boolean resultado;

    // Testanto igualdade
    resultado = numero1 == numero2;
    System.out.printf("%d é igual a %d: %b%n", numero1, numero2, resultado);

    resultado = numero1 == numero3;
    System.out.printf("%d é igual a %d: %b%n", numero1, numero3, resultado);

    // Testando diferença
    resultado = numero1 != numero2;
    System.out.printf("%d é diferente de %d: %b%n", numero1, numero2, resultado);

    resultado = numero1 != numero3;
    System.out.printf("%d é diferente de %d: %b%n", numero1, numero3, resultado);

  }
}
