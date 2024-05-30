package com.acsousa.javacourse._05_Arrays._07_ExpandindoUmArray;

import java.util.Arrays;

public class Lista {

  String nome;
  Item[] itens = new Item[0];

  void adicionarItem(Item item) {
    itens = Arrays.copyOf(itens, itens.length + 1);
    itens[itens.length - 1] = item;
  }
}
