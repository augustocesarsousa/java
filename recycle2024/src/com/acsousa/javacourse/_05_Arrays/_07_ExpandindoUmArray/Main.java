package com.acsousa.javacourse._05_Arrays._07_ExpandindoUmArray;

public class Main {

  public static void main(String[] args) {

    /*
      Um array em Java possui um tamanho fixo, mas podemos utilizar técnicas para almentar o seu tamanho,
      uma delas é utilizando o método copyOf da classe Arrays
     */

    Lista lista1 = new Lista();
    lista1.nome = "Supermercado";

    Item item1 = new Item();
    item1.descricao = "Arroz";
    item1.quantidade = 1;

    Item item2 = new Item();
    item2.descricao = "Leite";
    item2.quantidade = 3;

    Item item3 = new Item();
    item3.descricao = "Laranja";
    item3.quantidade = 10;

    lista1.adicionarItem(item1);
    lista1.adicionarItem(item2);
    lista1.adicionarItem(item3);

    System.out.println("Lista de " + lista1.nome);

    for (Item item : lista1.itens) {
      System.out.printf("%d - %s%n", item.quantidade, item.descricao);
    }
  }
}
