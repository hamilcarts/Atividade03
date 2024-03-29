package Exercicio01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando a agenda do professor
        Agenda agendaProfessor1 = new Agenda();
        agendaProfessor1.cadastrarCompromisso(new Compromisso("Tarefa 1", "Aula 01"));
        agendaProfessor1.cadastrarCompromisso(new Compromisso("Tarefa 2", "Aula 02"));
        Agenda agendaProfessor2 = new Agenda();
        agendaProfessor2.cadastrarCompromisso(new Compromisso("Tarefa 3", "aula 03"));

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
        Professor professor1 = new Professor("Paulo","12345678901",3000, agendaProfessor1, listaDeArtigos, turmasProfessor);
        Professor professor2 = new Professor("Pedro","12345678902",5000, agendaProfessor2, listaDeArtigos, turmasProfessor);



        // Cadastrando novos artigos na lista de artigos do professor
        professor1.cadastrarArtigo(new Artigo("Pedro", 2014));
        professor1.cadastrarArtigo(new Artigo("Então é Natal...", 2010));
        System.out.println(professor1.getArtigosPublicados().toString());

        // Removendo um artigo da lista
        professor1.removerArtigo("Pedro");
        System.out.println(professor1.getArtigosPublicados().toString());

        // Removendo um compromisso da agenda do professor
//        System.out.println(professor1.getAgenda().toString());
//        professor1.getAgenda().removerCompromisso("Tarefa 1");
//        System.out.println(professor1.getAgenda().toString());

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

        // Criando um secretário com agenda vazia
        System.out.println("Secretário");
        Secretario secretario = new Secretario("Silvio", "123456789-11", 3000., new Agenda());
        System.out.println(secretario);

        // Exibindo a agenda dos professores e do próprio secretário
        secretario.listarAgenda(professor1);
        secretario.listarAgenda(professor2);
        secretario.listarAgenda(secretario);

        // Criando um coordenador
        Coordenador coordenador = new Coordenador("Carlos", "222333145-78", 2750., new Agenda());
        // Exibindo a turma 1 sem professor alocado
        System.out.println(turma1);
        // Alocando um professor na turma1
        coordenador.alocarProfessor(professor1, turma1);
        // Exibindo a turma1 com um professor alocado
        System.out.println(turma1);

        // Removendo o professor da turma1
        coordenador.desalocarProfessor(professor1, turma1);
        System.out.println(turma1);

        // Criando um diretor
        Diretor diretor = new Diretor("Didi", "123123123-12", 8000., new Agenda());
        // Exibindo a lista vazia de professores orientados pelo diretor
        diretor.exibirProfessoresOrientados();
        // Adicionando um professor à lista de professores orientados pelo diretor
        diretor.orientarProfessor(professor1);
        // Exibindo a lista de professores orientados pelo diretor
        diretor.exibirProfessoresOrientados();
    }

}