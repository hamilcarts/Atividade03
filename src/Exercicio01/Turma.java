package Exercicio01;

public class Turma {

    private String nome;
    private Integer ano;

    public Turma(String nome, Integer ano) {
        this.nome = nome;
        this.ano = ano;
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

    @Override
    public String toString() {
        return "\'"+ nome+ "\' - " + ano;
    }
}
