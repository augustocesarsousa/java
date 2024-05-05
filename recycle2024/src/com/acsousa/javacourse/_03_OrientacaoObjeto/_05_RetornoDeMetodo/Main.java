package com.acsousa.javacourse._03_OrientacaoObjeto._05_RetornoDeMetodo;

public class Main {

  public static void main(String[] args) {

    Calculadora calculadora = new Calculadora();
    calculadora.numero1 = Math.random() * 100;
    calculadora.numero2 = Math.random() * 100;

    // Chamando os métodos do objeto caculadora
    double soma = calculadora.soma();
    double subtracao = calculadora.subtracao();
    double multiplicacao = calculadora.multiplicacao();
    double divisao = calculadora.divisao();

    System.out.printf("%.2f + %.2f = %.2f%n", calculadora.numero1, calculadora.numero2, soma);
    System.out.printf("%.2f - %.2f = %.2f%n", calculadora.numero1, calculadora.numero2, subtracao);
    System.out.printf("%.2f x %.2f = %.2f%n", calculadora.numero1, calculadora.numero2, multiplicacao);
    System.out.printf("%.2f / %.2f = %.2f%n", calculadora.numero1, calculadora.numero2, divisao);
  }
}
