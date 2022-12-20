package Exercicio01;

import java.util.ArrayList;

public class Professor extends Funcionario{
    private ArrayList<String> artigosPublicados;
    private ArrayList<String> turma;

    public Professor(String nome, String cpf, double salario, Agenda agenda, ArrayList<String> artigosPublicados, ArrayList<String> turma) {
        super(nome, cpf, salario, agenda);
        this.artigosPublicados = artigosPublicados;
        this.turma = turma;
    }

    public void cadastrarArtigo(String artigo){
        this.artigosPublicados.add(artigo);
    }
    public ArrayList<String> getArtigosPublicados() {
        return artigosPublicados;
    }

    public void setArtigosPublicados(ArrayList<String> artigosPublicados) {
        this.artigosPublicados = artigosPublicados;
    }

    public ArrayList<String> getTurma() {
        return turma;
    }

    public void setTurma(ArrayList<String> turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", salario=" + getSalario() +
                ", agenda=" + getAgenda() +
                " artigosPublicados=" + artigosPublicados +
                ", turma=" + turma +
                '}';
    }
}
