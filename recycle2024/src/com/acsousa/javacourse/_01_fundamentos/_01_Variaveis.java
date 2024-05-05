package com.acsousa.javacourse._01_Fundamentos;

public class _01_Variaveis {

  public static void main(String[] args) {
    /*
      Uma variável é o elemento responsável por armazenar um valor na memória do computador
      No Java a convenção recomenda a criação de uma variável por linha
      Os nomes das variáveis devem seguir o padrão lowerSnakeCase, exemplo, umaVariavel
      Os nomes das variáveis não podem iniciar com dígitos, exemplo, 1variavel
      Toda variável em Java deve possuir um tipo
     */

    //Declarando três variáveis do tipo numérico inteiro
    int numero1;
    int numero2;
    int resultado;

    //Atribuindo valores para as variáveis
    numero1 = 15;
    numero2 = 11;

    //Executando uma operação aritmética de soma e atribuindo o valor para a variavel resultado
    resultado = numero1 + numero2;

    //Imprimindo o valor da variável resultado
    System.out.println(resultado);
  }
}
