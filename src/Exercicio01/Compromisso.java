package Exercicio01;

public class Compromisso {


    private String titulo;
    private String descricao;

    public Compromisso(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Compromisso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Título:' " + titulo + '\'' +
                ", Descrição:' " + descricao + '\'';
    }
}

