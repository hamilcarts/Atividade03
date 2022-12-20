package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nome;
    private Integer ano;
    private List<Professor> listaDeProfessores;

    public Turma(String nome, Integer ano) {
        this.nome = nome;
        this.ano = ano;
        this.listaDeProfessores = new ArrayList<>();
    }



    public Turma() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public List<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public void setListaDeProfessores(List<Professor> listaDeProfessores) {
        this.listaDeProfessores = listaDeProfessores;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", listaDeProfessores=" + listaDeProfessores +
                '}';
    }
}
