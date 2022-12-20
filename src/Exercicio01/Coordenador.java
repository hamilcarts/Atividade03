package Exercicio01;

public class Coordenador extends Funcionario {

    public Coordenador(String nome, String cpf, double salario, Agenda agenda) {
        super(nome, cpf, salario, agenda);
    }

    public void alocarProfessor(Professor professor, Turma turma) {
        turma.getListaDeProfessores().add(professor);
        System.out.println("Professor: " + professor.getNome() + " alocado na turma: " + turma.getNome());
    }

    public void desalocarProfessor(Professor professor, Turma turma){
        for(Professor prof : turma.getListaDeProfessores()){
            if(prof.getNome().equals(professor.getNome())){
                turma.getListaDeProfessores().remove(prof);
                return;
            }
        }
    }
}
