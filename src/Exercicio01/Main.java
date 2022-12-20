package Exercicio01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> artigosProfessor1 = new ArrayList<>();
        ArrayList<String> turmasProfessor1 = new ArrayList<>();
        Agenda agendaprofessor1 = new Agenda();
        agendaprofessor1.adicionarCompromisso("Tarefa 1", "Aula 01");
        agendaprofessor1.adicionarCompromisso("Tarefa 2", "Aula 02");

        Professor professor1 = new Professor("José","12345678901",3000,agendaprofessor1 , artigosProfessor1,turmasProfessor1);

        Agenda agendaFuncionario1 = new Agenda();
        Funcionario funcionario1 = new Funcionario("Mateus", "012345678910", 1500, agendaFuncionario1);
        agendaFuncionario1.adicionarCompromisso("Adicionar matérias", "adicionar matérias da turma 01");
        System.out.println(agendaFuncionario1);

        System.out.println(professor1);
        System.out.println(funcionario1);
    }
}