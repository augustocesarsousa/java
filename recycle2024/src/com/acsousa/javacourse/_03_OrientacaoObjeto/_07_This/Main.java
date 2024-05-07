package com.acsousa.javacourse._03_OrientacaoObjeto._07_This;

public class Main {

  public static void main(String[] args) {

    Produto produto =  new Produto();
    produto.precoCusto = 32.99;
    double porcentagemDeLucro = 32;

    produto.atribuirPorcentagemDeLucro(porcentagemDeLucro);
    produto.calcularPrecoVenda();

    System.out.printf("Valor de custo do produto: %.2f%n", produto.precoCusto);
    System.out.printf("Preço de venda do produto: %.2f%n", produto.precoVenda);
  }
}
