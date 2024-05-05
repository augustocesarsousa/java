package com.acsousa.javacourse._01_Fundamentos;

public class _03_AbreviacaoOperadoresAritmeticos {
  public static void main(String[] args) {

    /*
      No Java podemos abreviar os cinco operadores artiméticos
      quando queremos fazer uma operação com uma variável e aplicar
      o resultado na mesma variável
     */

    //Declarando a variável de teste
    int numero = 15;

    //Somando 5 à variável
    numero += 5;
    System.out.println("15 + 5 = " + numero);
    //Retornando o valor da variável para 15
    numero = 15;

    //Subtraindo 5 da variável
    numero -= 5;
    System.out.println("15 - 5 = " + numero);
    numero = 15;

    //Multiplicando o valor da variável por 5
    numero *= 5;
    System.out.println("15 * 5 = " + numero);
    numero = 15;

    //Dividindo o valor da variável por 5
    numero /= 5;
    System.out.println("15 / 5 = " + numero);
    numero = 15;

    //Obtendo o módulo da divição da variável por 5
    numero %= 5;
    System.out.println("15 % 5 = " + numero);
  }
}
