package com.acsousa.javacourse._01_fundamentos;

public class _07_PromocaoAritmedica {
  public static void main(String[] args) {

    /*
      No Java, quando fazermos uma operação com duas variáveis de tipos diferentes o resulta será
      sempre do tipo da variável de maior capacidade
      Ao fazer uma divisao de um número int ímpar por um numero int par, o resultado será um número
      int e não um número de ponto flutuante, para resulver essa questão um dos números deve ser
      convertido para um tipo ponto flutuante
     */

    // Declarando as variáveis de teste
    int numeroInt1 = 25;
    int numeroInt2 = 2;
    long numeroLong1 = 5;

    // Somando um int com long
    // int resultadoSoma = numeroInt1 + numeroLong1; // não compila
    long resultadoSoma = numeroInt1 + numeroLong1;
    System.out.println(resultadoSoma);

    // Divisão de número ímpar por número par sem conversão
    int resultadoDivisao1 = numeroInt1 / numeroInt2;
    System.out.println(resultadoDivisao1);

    // Divisão de número ímpar por número par sem conversão
    float resultadoDivisao2 = (float) numeroInt1 / numeroInt2;
    System.out.println(resultadoDivisao2);
  }
}
