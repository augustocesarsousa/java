package com.acsousa.javacourse._04_WrappersEBoxing._03_ComparacaoDeWrappers;

public class Main {

  public static void main(String[] args) {

    /*
      A comparação de classes wrapper em Java pode ser feita de duas maneiras principais:

      O operador == verifica se duas referências de objeto apontam para o mesmo objeto na memória.
      No caso de classes wrapper, ele compara se as variáveis referenciam o mesmo objeto wrapper,
      não se os valores armazenados dentro dos wrappers são iguais.

      O método equals() compara o valor armazenado dentro dos objetos wrapper. Ele é o método
      recomendado para comparar classes wrapper, pois garante que a comparação seja feita com
      base no valor e não na referência do objeto.
     */

    Integer numeroInteger1 = 1000;
    Integer numeroInteger2 = 1000;

    // Comparação com ==
    System.out.println("Integer == Integer: " + (numeroInteger1 == numeroInteger2));

    // Comparação com equals
    System.out.println("Integer equals Integer: " + (numeroInteger1.equals(numeroInteger2)));
  }
}
