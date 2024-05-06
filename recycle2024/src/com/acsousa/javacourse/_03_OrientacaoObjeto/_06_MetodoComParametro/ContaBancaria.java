package com.acsousa.javacourse._03_OrientacaoObjeto._06_MetodoComParametro;

public class ContaBancaria {

  /*
    Os métodos dos objetos podem receber valores passados por parâmetros
    esses valores são definidos na assinatura do método
   */

  double saldo;

  // Criando o método que recebe os parâmetros tipoOperacao e valor para realizar uma operação
  void realizarOperacao(String tipoOperacao, double valor) {

    switch (tipoOperacao) {
      case "deposito":
        saldo += valor;
        System.out.printf("Depósito realizado, saldo atual = %.2f%n", saldo);;
        break;
      case "saque":
        saldo -= valor;
        System.out.printf("Saque realizado, saldo atual = %.2f%n", saldo);
        break;
      default:
        System.out.println("Operação não cadastrada!");
    }
  }
}
