package com.acsousa.javacourse._05_Arrays._03_Iteracao;

public class Calculadora {

  /*
    Em Java, podemos percorrer todos os elementos de um array através da iteração.
    Ela é feita utilizando uma estrutura de repetição que acessa cada elemento do array
   */

  static double calcularMedia(double[] notas) {

    double total = 0;

    // Iterando os elementos do array notas com um for normal
    for (int i = 0; i < notas.length; i++) {
      total += notas[i];
    }

    // Iteração com for melhorado
    /*
      for (double nota : notas) {
        total += nota;
      }
     */

    return total / notas.length;
  }
}
