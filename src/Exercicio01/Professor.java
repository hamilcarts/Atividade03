package Exercicio01;

import java.util.List;

public class Professor extends Funcionario {

    private List<Artigo> artigosPublicados;
    private List<Turma> turmasPeriodo;

    public Professor(String nome, String cpf, double salario, Agenda agenda, List<Artigo> artigosPublicados, List<Turma> turmasPeriodo) {
        super(nome, cpf, salario, agenda);
        this.artigosPublicados = artigosPublicados;
        this.turmasPeriodo = turmasPeriodo;
    }

    public void cadastrarArtigo(Artigo artigo) {
        this.artigosPublicados.add(artigo);
    }

    public void removerArtigo(String titulo) {
        if (artigosPublicados.size() == 0) {
            return;
        }
        if (!artigosPublicados.contains(new Artigo(titulo))) {
            System.out.println("Artigo inexistente na lista.");
            return;
        }
        for (Artigo artigo : artigosPublicados) {
            if (artigo.getTitulo().equals(titulo)) {
                artigosPublicados.remove(artigo);
            }
        }
    }

    public void cadastrarTurma(Turma turma) {
        this.turmasPeriodo.add(turma);
    }

    public void removerTurma(String nome, Integer ano) {
        if (turmasPeriodo.size() == 0) {
            return;
        }
        for (Turma turma : turmasPeriodo) {
            if (turma.getNome().equals(nome)) {
                if (turma.getAno().equals(ano)) {
                    turmasPeriodo.remove(turma);
                    return;
                }
                System.out.println("Ano não encontrado para a turma: " + "\'" + turma.getNome() + "\'");
                return;
            }
        }
        System.out.println("Turma não encontrada.");
    }

    public List<Artigo> getArtigosPublicados() {
        return artigosPublicados;
    }

    public void setArtigosPublicados(List<Artigo> artigosPublicados) {
        this.artigosPublicados = artigosPublicados;
    }

    public List<Turma> getTurmasPeriodo() {
        return turmasPeriodo;
    }

    public void setTurmasPeriodo(List<Turma> turmasPeriodo) {
        this.turmasPeriodo = turmasPeriodo;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "Nome:'" + getNome() + '\'' +
                ", CPF:'" + getCpf() + '\'' +
                ", Salário:" + getSalario() +
                ", Agenda:" + getAgenda() +
                " Artigos Publicados:" + artigosPublicados +
                ", Turmas:" + turmasPeriodo +
                '}';
    }
}


