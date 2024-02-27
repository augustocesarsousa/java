package com.acsousa.javacourse._01_fundamentos;

public class _06_ConversaoTiposPrimitivos {
  public static void main(String[] args) {

    /*
      No Java, podemos atribuir o valor de uma variável em outra de tipo diferente, porém devemos
      seguir algumas regras
      1 - Uma variável com capacidade menor pode ser atribuída em uma variável com capacidade maior
      sem problemas
      2 - Para uma variável com capacidade maior ser atribuída em uma variável com capacidade menor
      deve passar pelo procedimento de casting, porém se o valor da variável for maior do que a
      capacidade da variável menor, o resultado é um número diferente
      3 - Para uma variável do tipo ponto flutuante ser atribuída em uma variável do tipo inteira
      deve passar pelo procedimento de casting, porém a precição das casas decimais será perdida
     */

    // Declarando as variáveis de teste
    int numeroInteiro = 123;
    int numeroInteiro2 = 0;

    long numeroLong = 123_456_789_012L;
    long numeroLong2 = 0L;

    float numeroFloat = 123.4F;
    float numeroFloat2 = 0.0F;

    double numeroDouble = 12_345_678.90;
    double numeroDouble2 = 0.0;

    // Conversão de int para long
    numeroLong2 = numeroInteiro;
    System.out.println("Int para long");
    System.out.println(numeroInteiro);
    System.out.println(numeroLong2);

    // Conversão de long para int com casting
    numeroInteiro2 = (int) numeroLong2;
    System.out.println("Long para int");
    System.out.println(numeroLong2);
    System.out.println(numeroInteiro2);

    // Conversão de long para int com perca de capacidade
    numeroInteiro2 = (int) numeroLong;
    System.out.println("Long para int, perda de capacidade");
    System.out.println(numeroLong);
    System.out.println(numeroInteiro2);

    // Conversão de float para double
    numeroDouble2 = numeroFloat;
    System.out.println("Float para double");
    System.out.println(numeroFloat);
    System.out.println(numeroDouble2);

    // Conversão de double para float
    numeroFloat2 = (float) numeroDouble;
    System.out.println("Float para double");
    System.out.println(numeroDouble2);
    System.out.println(numeroFloat2);

  }
}
