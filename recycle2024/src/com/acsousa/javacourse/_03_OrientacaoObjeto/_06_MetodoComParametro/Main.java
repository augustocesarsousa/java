package com.acsousa.javacourse._03_OrientacaoObjeto._06_MetodoComParametro;

public class Main {

  public static void main(String[] args) {

    // Criando o objeto conta bancária
    ContaBancaria contaBancaria = new ContaBancaria();

    // Definindo o saldo da conta
    contaBancaria.saldo = 1000;

    // Realizando uma operação de depósito passando os dados por parâmetros
    contaBancaria.realizarOperacao("deposito", 150);

    // Realizando uma operação de saque passando os dados por parâmetros
    contaBancaria.realizarOperacao("saque", 125.25);
  }
}
