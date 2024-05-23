package com.acsousa.javacourse._05_Arrays._04_ImprimindoArrays;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    /*
      No Java podemos fazer a impressão de um array utilizando o método toString da classe Arrays
      esse método retorna o array em formato de um String
     */

    int[] lista = {23, 10, 33, 21, 98, 44, 57};

    // Utilizando o método para conversão do array em String
    String listaString = Arrays.toString(lista);

    System.out.println(listaString);
  }
}
