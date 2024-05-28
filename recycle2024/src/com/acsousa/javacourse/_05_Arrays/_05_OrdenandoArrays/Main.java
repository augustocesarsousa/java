package com.acsousa.javacourse._05_Arrays._05_OrdenandoArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {

    /*
      Em Java, podemos ordenar um array utilizando o método sort da classe Arrays
     */

    Integer[] listaDeNumeros = new Integer[10];

    for (int i = 0; i < listaDeNumeros.length; i++) {
      listaDeNumeros[i] = (int) (Math.random() * 100);
    }

    System.out.println("Array na ordem natural:");
    System.out.println(Arrays.toString(listaDeNumeros));

    // Ordenando o array
    Arrays.sort(listaDeNumeros);
    System.out.println("Array na ordem crescente:");
    System.out.println(Arrays.toString(listaDeNumeros));

    // Ordenando em ordem decrecente
    Arrays.sort(listaDeNumeros, Comparator.reverseOrder());
    System.out.println("Array na ordem decrecente:");
    System.out.println(Arrays.toString(listaDeNumeros));
  }
}
