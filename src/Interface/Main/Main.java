package Interface.Main;

import Interface.Jack.IJacket;
import Interface.Jack.NikeJacket;
import Interface.Shoes.AdidasShoes;
import Interface.Trousers.FilaTrousers;

public class Main {
    public static void main(String[] args){
        AdidasShoes bbb = new AdidasShoes();
        NikeJacket aaa = new NikeJacket();
        FilaTrousers zzz = new FilaTrousers();
        Person Sema = new Person("Sema",zzz,aaa,bbb);
        Sema.on();
        System.out.println(Sema);
    }
}
