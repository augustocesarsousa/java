package com.acsousa.javacourse._01_Fundamentos;

public class _09_Print {
  public static void main(String[] args) {

    /*
      Para imprimir textos em Java utilizamos a classe System.out.print, essa classe possui variações
      com funções diferentes, veremos a seguir
     */

    // Impriminto um texto simples, sem pular linha
    System.out.print("Imprimindo texto com print!");

    // Quando utilizamos apenas o print, precisamos inserir uma quebra de linha
    System.out.println(" ");

    // Imprimindo um texto e pulando a linha com println
    System.out.println("Impriminto texto com println!");

    // Podemos juntar textos e números na impressão utilizando o caractere + para concatenar
    int numero1 = 20;
    System.out.println("Olá meu nome é João e tenho " + numero1 + " anos");

    // Quando utilizamos o caractere +, devemos ter atenção para a precedência
    int numero2 = 30;
    System.out.println("O resultado é " + numero1 + numero2);
    System.out.println(numero1 + numero2 + " é o resultado");

    /*
      Podemos utilizar o printf para formatar os textos
      ele utiliza especificadores para formatar os textos, são eles os principais
      %s: String de caracteres
      %d: Número inteiro decimal
      %f: Número de ponto flutuante
      %c: Caractere (char)
      %n: Quebra de linha
     */

    // Colocamos o especificador no lugar do texto que queremos exibir
    System.out.printf("Imprimindo um %s com printf!%n", "texto");

    // Podemos colocar números
    System.out.printf("%d + %d = %d%n", numero1, numero2, numero1 + numero2);

    // Podemos definir as casas decimais de um número de ponto flutuante
    System.out.printf("%d / %d = %.2f%n", numero1, numero2, (double) numero1 / numero2);
    System.out.printf("%d / %d = %.3f%n", numero1, numero2, (double) numero1 / numero2);
    System.out.printf("%d / %d = %.4f%n", numero1, numero2, (double) numero1 / numero2);
    System.out.printf("%d / %d = %.5f%n", numero1, numero2, (double) numero1 / numero2);

    /*
      Podemos utilizar uma sequência de scape para imprimir caracteres especiais
      utilizamos o caractere de barra invertida \ mais o caractere que desejamos
     */

    // Imprimindo texto com aspas
    System.out.println("Utilizando \"scape\" para imprimir caracteres especiais");
    System.out.println("C:\\Windows\\System32");
  }
}
