package Exercicio03;

public class IphoneFactory {

    public Iphone cadastrarIphone(TypeIphoneEnum typeIphoneEnum){

        Iphone iphone = null;

        if(TypeIphoneEnum.IPHONE_X.equals(typeIphoneEnum)){
            iphone = new IphoneX();
        } else if (TypeIphoneEnum.IPHONE_9.equals(typeIphoneEnum)){
            iphone = new Iphone9();
        } else if (TypeIphoneEnum.IPHONE_13_MINI.equals(typeIphoneEnum)) {
            iphone = new Iphone13Mini();
        }

        return iphone;
    }
}
