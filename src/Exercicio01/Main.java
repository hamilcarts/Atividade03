package Exercicio01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando a agenda do professor
        Agenda agendaProfessor = new Agenda();
        agendaProfessor.cadastrarCompromisso(new Compromisso("Tarefa 1", "Aula 01"));
        agendaProfessor.cadastrarCompromisso(new Compromisso("Tarefa 2", "Aula 02"));

        // Criando artigos e inserindo na lista
        Artigo artigo1 = new Artigo("A casa", 2022);
        Artigo artigo2 = new Artigo("O bolo", 2020);
        Artigo artigo3 = new Artigo("A copa do mundo", 1970);
        List<Artigo> listaDeArtigos = new ArrayList<>(Arrays.asList(artigo2, artigo1, artigo3));

        // Criando turmas e inserindo na lista
        Turma turma1 = new Turma("5D", 2020);
        Turma turma2 = new Turma("7H", 2002);
        Turma turma3 = new Turma("3A", 2019);
        List<Turma> turmasProfessor = new ArrayList<>(Arrays.asList(turma1, turma2, turma3));

        // Criando o professor1
        Professor professor1 = new Professor("José","12345678901",3000, agendaProfessor, listaDeArtigos, turmasProfessor);

        // Cadastrando novos artigos na lista de artigos do professor
        professor1.cadastrarArtigo(new Artigo("Pedro", 2014));
        professor1.cadastrarArtigo(new Artigo("Então é Natal...", 2010));
        System.out.println(professor1.getArtigosPublicados().toString());

        // Removendo um artigo da lista
        professor1.removerArtigo("Pedro");
        System.out.println(professor1.getArtigosPublicados().toString());

        // Removendo um compromisso da agenda do professor
        System.out.println(professor1.getAgenda().toString());
        professor1.getAgenda().removerCompromisso("Tarefa 1");
        System.out.println(professor1.getAgenda().toString());

        // Removendo uma turma existente
        System.out.println("Turmas do professor1");
        System.out.println(professor1.getTurmasPeriodo().toString());
        professor1.removerTurma("5D", 2020);
        // Conferindo a lista após a remoção
        System.out.println(professor1.getTurmasPeriodo().toString());

        // Tentando remover uma turma inexistente
        professor1.removerTurma("5H", 2010);
        // Verificando que a lista de turmas continua igual
        System.out.println(professor1.getTurmasPeriodo().toString());
    }
}