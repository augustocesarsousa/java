package com.acsousa.javacourse._01_fundamentos;

public class _08_Precedencia {
  public static void main(String[] args) {
    /*
      As operações em Java seguem uma ordem de precência onde um operador tem prioridade sobre outros
      a order de precedência seguida em Java é:
      1. Incremento e Decremento
      2. Multiplicação, Divisão e Resto da Divisão
      3. Adição e Subtração
      4. Parênteses
      A operações em Java são calculadas da esquerda para a direita
     */

    // Declarando variáveis para teste
    int x = 2;
    int y;

    // Precedência sem parênteses
    y = 1 + x * 4 - ++x;
    System.out.println(y);



    // Precedência com parênteses
    x = 2;
    y = ((1 + x) * 4) - ++x;
    System.out.println(y);
  }
}
