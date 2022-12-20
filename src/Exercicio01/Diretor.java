package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario{
    private List<Professor> professoresOrientados;

    public Diretor(String nome, String cpf, double salario, Agenda agenda) {
        super(nome, cpf, salario, agenda);
        this.professoresOrientados = new ArrayList<>();
    }
    public void orientarProfessor(Professor professor){
        System.out.println("Professor " + professor.getNome() + " foi orientado pelo diretor.");
        professoresOrientados.add(professor);
    }

    public void exibirProfessoresOrientados(){
        System.out.println("Professores orientados pelo diretor: ");
        if(professoresOrientados.size() == 0){
            System.out.println("Nenhum professor orientado pelo diretor.");
            return;
        }
        int i = 1;
        for(Professor professor : professoresOrientados){
            System.out.println(i + " - " + professor.getNome());
            i++;
        }
    }

    public List<Professor> getProfessoresOrientados() {
        return professoresOrientados;
    }

    public void setProfessoresOrientados(List<Professor> professoresOrientados) {
        this.professoresOrientados = professoresOrientados;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "professoresOrientados=" + professoresOrientados +
                '}';
    }
}
