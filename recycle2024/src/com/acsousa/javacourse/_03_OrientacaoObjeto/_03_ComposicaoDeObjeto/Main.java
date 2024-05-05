package com.acsousa.javacourse._03_OrientacaoObjeto._03_ComposicaoDeObjeto;

public class Main {

  public static void main(String[] args) {

    // Instância do objeto aula
    Aula aula = new Aula();

    // Definindo valores para os atributos do objeto aula
    aula.id = 1;
    aula.numeroSala = 15;
    aula.diasDaSemana = "Segunda à sexta";
    aula.horario = "19:00 às 21:00";

    // Instância do objeto que compoe a aula
    Materia materia = new Materia();

    // Definindo valores para os atributos do objeto materia
    materia.id = 1;
    materia.nome = "Lógica de Programação";

    // Atribuindo o objeto materia ao objeto aula
    aula.materia = materia;

    // Imprimindo dados
    System.out.printf("Aula:%n%n");
    System.out.printf("Matéria: %s%n", aula.materia.nome);
    System.out.printf("Dias da semana: %s%n", aula.diasDaSemana);
    System.out.printf("Horário: %s%n", aula.horario);
    System.out.printf("Sala: %d%n", aula.numeroSala);

  }
}
