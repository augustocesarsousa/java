package com.acsousa.javacourse._03_OrientacaoObjeto._11_InferenciaDeTipo;

public class Main {

  public static void main(String[] args) {

    /*
      A inferência de tipo em Java é um recurso que permite ao compilador deduzir o tipo
       de uma variável automaticamente, com base em seu valor inicial ou em como ela é
       usada. Isso significa que você não precisa especificar explicitamente o tipo da
       variável em todas as declarações.
     */

    // Criando a variável do tipo Pessoa inferindo o tipo
    var pessoa = new Passoa();

    pessoa.cpf = "12345678910";
    pessoa.nome = "Sushi Sousa";
    pessoa.telefone = "4488-0000";
    pessoa.idade = 20;

    System.out.println("CPF: " + pessoa.cpf);
    System.out.println("Nome: " + pessoa.nome);
    System.out.println("Telefone: " + pessoa.telefone);
    System.out.println("Idade: " + pessoa.idade);
  }
}
