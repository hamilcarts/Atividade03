package Exercicio03;

public enum TypeIphoneEnum {

    IPHONE_9("Iphone 9", 250, "12 x 24"),
    IPHONE_X("Iphone X", 225, "13 x 22"),
    IPHONE_13_MINI("Iphone 13 - Mini", 180, "9,5 x 20");

    private final String nome;
    private final Integer peso;
    private final String medidas;

    TypeIphoneEnum(String nome, Integer peso, String medidas){
        this.nome = nome;
        this.peso = peso;
        this.medidas = medidas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPeso() {
        return peso;
    }

    public String getMedidas() {
        return medidas;
    }
}
