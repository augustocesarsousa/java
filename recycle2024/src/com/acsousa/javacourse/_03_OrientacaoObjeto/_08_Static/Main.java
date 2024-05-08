package com.acsousa.javacourse._03_OrientacaoObjeto._08_Static;

public class Main {

  public static void main(String[] args) {

    double numero1 = Math.random() * 100;
    double numero2 = Math.random() * 100;

    // Utilizando os métodos static sem criar uma instância da classe Calculadora
    double resultadoSoma = Calculadora.soma(numero1, numero2);
    double resultadoSubtracao = Calculadora.subtracao(numero1, numero2);
    double resultadoMultiplicacao = Calculadora.soma(numero1, numero2);
    double resultadoDivisao = Calculadora.divisao(numero1, numero2);

    System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, resultadoSoma);
    System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, resultadoSubtracao);
    System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, resultadoMultiplicacao);
    System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, resultadoDivisao);
  }
}
