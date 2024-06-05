package com.acsousa.javacourse._05_Arrays._09_ArraysMultidimensionais;

public class Main {

  public static void main(String[] args) {

    /*
      Podemos criar arrays com mais de uma dimensão em Java
     */

    // Instanciando um array de duas dimensões com 3 linhas e 3 colunas
    String[][] paises = new String[3][3];

    // Adicionando dados no array
    paises[0][0] = "Brasil";
    paises[0][1] = "Argentina";
    paises[0][2] = "Paraguai";

    paises[1][0] = "Estados Unidos";
    paises[1][1] = "Canada";
    paises[1][2] = "México";

    paises[2][0] = "Espanha";
    paises[2][1] = "Itália";
    paises[2][2] = "Portugal";

    // Imprimindo os valores do array
    System.out.printf("%s - %s - %s%n", paises[0][0], paises[0][1], paises[0][2]);
    System.out.printf("%s - %s - %s%n", paises[1][0], paises[1][1], paises[1][2]);
    System.out.printf("%s - %s - %s%n", paises[2][0], paises[2][1], paises[2][2]);
  }
}
