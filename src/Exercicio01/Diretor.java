package Exercicio01;

import java.util.ArrayList;

public class Diretor extends Funcionario{
    private ArrayList<String> professorOrientador;

    public void orientarProfessor(){
        System.out.println("orientar professor");
    }

    public void exibirProfessoresOrientados(){
        System.out.println("Professores orientados: ");
    }
    public ArrayList<String> getProfessorOrientador() {
        return professorOrientador;
    }

    public void setProfessorOrientador(ArrayList<String> professorOrientador) {
        this.professorOrientador = professorOrientador;
    }

    public Diretor(String nome, String cpf, double salario, Agenda agenda, ArrayList<String> professorOrientador) {
        super(nome, cpf, salario, agenda);
        this.professorOrientador = professorOrientador;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "professorOrientador=" + professorOrientador +
                '}';
    }
}
