package com.acsousa.javacourse._05_Arrays._10_IteracaoArrayMultidimensional;

public class Main {

  public static void main(String[] args) {

    /*
      Para iterar um array multidimensinal, utilizamos um laço para cada dimensão do array
     */

    String[][] paisesPorContinente = new String[3][3];

    paisesPorContinente[0][0] = "Brasil";
    paisesPorContinente[0][1] = "Argentina";
    paisesPorContinente[0][2] = "Paraguai";

    paisesPorContinente[1][0] = "Estados Unidos";
    paisesPorContinente[1][1] = "Canada";
    paisesPorContinente[1][2] = "México";

    paisesPorContinente[2][0] = "Espanha";
    paisesPorContinente[2][1] = "Itália";
    paisesPorContinente[2][2] = "Portugal";

    // Iterando o array com for, acessando a primeira dimensão
    for (int i = 0; i < paisesPorContinente.length; i++) {
      // Acessando a segunda dimensão
      for (int j = 0; j < paisesPorContinente[i].length; j++) {
        System.out.printf("[%d][%d] = %s%n", i, j, paisesPorContinente[i][j]);
      }
    }

    System.out.println("--------");

    // Iterando com o for melhorado
    for (String[] listaPaises : paisesPorContinente) {
      for (String pais : listaPaises) {
        System.out.println(pais);
      }
    }

  }
}
