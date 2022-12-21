package Exercicio03;

public class Programa {

    public static void main(String[] args) {

        Iphone iphone1 = new IphoneFactory().cadastrarIphone(TypeIphoneEnum.IPHONE_9);
        Iphone iphone2 = new IphoneFactory().cadastrarIphone(TypeIphoneEnum.IPHONE_X);
        Iphone iphone3 = new IphoneFactory().cadastrarIphone(TypeIphoneEnum.IPHONE_13_MINI);

        iphone1.exibirDetalhes();
        iphone2.exibirDetalhes();
        iphone3.exibirDetalhes();





    }
}
