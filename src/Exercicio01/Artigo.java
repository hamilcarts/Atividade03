package Exercicio01;

import java.util.Objects;

public class Artigo {

    private String titulo;
    private Integer anoPublicacao;

    public Artigo(String titulo, Integer anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public Artigo(String titulo) {
        this.titulo = titulo;
    }

    public Artigo() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artigo artigo = (Artigo) o;
        return titulo.equals(artigo.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    @Override
    public String toString() {
        return  "Título:'" + titulo + '\'' +
                ", Publicado em:'" + anoPublicacao + '\'';
    }
}
