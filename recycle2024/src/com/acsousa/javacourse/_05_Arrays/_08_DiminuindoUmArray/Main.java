package com.acsousa.javacourse._05_Arrays._08_DiminuindoUmArray;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    /*
      Em Java não podemos excluir um elemento de um array, mas podemos utilizar uma técnica com o método arraycopy
      da classe System que faz uma cópia do array original, porém nos dá a opção de remover um elemento
     */

    // Array de números inteiros
    int[] lista = {23, 89, 44, 12, 13, 54};

    // Novo array com uma posição menor
    int[] novaLista = new int[lista.length - 1];

    // Definindo a posição do número que queremos excluir
    int posicaoExclusao = 1;

    // Utilizando o método arraycopy para copiar os elementos antes da posição de exclusão
    System.arraycopy(lista, 0, novaLista, 0, posicaoExclusao);

    // Utilizando o método arraycopy para copiar os elementos após a posição de exclusão
    System.arraycopy(lista, posicaoExclusao + 1, novaLista,
      posicaoExclusao, novaLista.length - posicaoExclusao);

    System.out.println(Arrays.toString(lista));
    System.out.println(Arrays.toString(novaLista));
  }
}
