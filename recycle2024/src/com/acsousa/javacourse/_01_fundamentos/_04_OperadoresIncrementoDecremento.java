package com.acsousa.javacourse._01_Fundamentos;

public class _04_OperadoresIncrementoDecremento {
  public static void main(String[] args) {

    /*
      No Java temos dois operadores quando queremos adicionar ou remover
      uma unidade à uma variável, são eles
      incremento (++)
      decremento (--)
     */

    //Declarando variáveis de teste
    int numero1 = 10;
    int numero2 = 10;

    //Incrementando
    numero1++;
    System.out.println("Incremento " + numero1);

    //Decrementando
    numero2--;
    System.out.println("Decremento " + numero2);

    /*
      Esses operadores possuem duas variações
      a primeira é a pós-incremento e pós-decremento, que é quando a operação
      ocorre após o uso da variável
      a segunda é a pré-incremento e pré-decremento, que é quando a operação
      ocorre antes do uso da variável
     */

    int numero3 = 10;
    int numero4 = 10;
    int numero5 = 10;
    int numero6 = 10;

    //Pré-incremento
    System.out.println("Pré-incremento " + ++numero3);
    System.out.println("Pós-incremento " + numero4++);
    System.out.println("Pré-decremento " + --numero5);
    System.out.println("Pós-decremento " + numero6--);
  }
}
