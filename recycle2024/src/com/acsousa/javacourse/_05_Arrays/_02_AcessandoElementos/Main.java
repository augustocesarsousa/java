package com.acsousa.javacourse._05_Arrays._02_AcessandoElementos;

public class Main {

  public static void main(String[] args) {

    /*
      Para acessar um elemento específico do array, você utiliza a notação de colchetes [], informando o índice do
      elemento desejado. O índice do array começa em 0 (zero), então, para acessar o primeiro elemento, utiliza-se o
      índice 0, para o segundo elemento o índice 1 e assim por diante.
     */

    int[] arrayTeste = new int[5];

    // Atribuindo valores para cada elemento
    arrayTeste[0] = 23;
    arrayTeste[1] = 98;
    arrayTeste[2] = 8;
    arrayTeste[3] = 33;
    arrayTeste[4] = 75;

    // Acessando os elementos
    System.out.printf("Posição 0 = %d%n", arrayTeste[0]);
    System.out.printf("Posição 1 = %d%n", arrayTeste[1]);
    System.out.printf("Posição 2 = %d%n", arrayTeste[2]);
    System.out.printf("Posição 3 = %d%n", arrayTeste[3]);
    System.out.printf("Posição 4 = %d", arrayTeste[4]);

  }
}
