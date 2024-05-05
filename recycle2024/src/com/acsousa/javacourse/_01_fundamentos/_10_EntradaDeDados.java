package com.acsousa.javacourse._01_Fundamentos;

import java.util.Scanner;

public class _10_EntradaDeDados {

  public static void main(String[] args) {
    /*
      Para receber a entrada de dados via teclado no terminal, podemos utilizar o classe Scanner
     */

    // Criando uma variável do tipo Scanner para receber a entrada dos dados
    Scanner scanner = new Scanner(System.in);

    // Solicitando a entrada dos dados
    System.out.print("Digite seu nome: ");

    // Recebendo a entrada dos dados e atribuindo para um variável
    String nome = scanner.nextLine();

    // Exibindo os dados informados
    System.out.printf("Seu nome é %s", nome);
  }

}
