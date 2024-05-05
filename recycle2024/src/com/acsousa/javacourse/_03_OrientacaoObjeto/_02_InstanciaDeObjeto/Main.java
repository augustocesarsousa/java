package com.acsousa.javacourse._03_OrientacaoObjeto._02_InstanciaDeObjeto;

public class Main {

  public static void main(String[] args) {

    // Criando uma variável do tipo Pessoa
    Pessoa pessoa;

    // Criando uma instência da variável pessoa
    pessoa = new Pessoa();

    // Definindo valores para os atributos da pessoa
    pessoa.cpf = "12345678910";
    pessoa.nome = "Sushi Sousa";
    pessoa.telefone = "12345678";
    pessoa.idade = 20;

    // Acessando e imprimindo os valores dos atributos da pessoa
    System.out.printf("CPF = %S%n", pessoa.cpf);
    System.out.printf("Nome = %S%n", pessoa.nome);
    System.out.printf("Telefone = %S%n", pessoa.telefone);
    System.out.printf("Idade = %d%n", pessoa.idade);
  }
}
