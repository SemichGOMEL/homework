package Interface.Main;

import Interface.Jack.IJacket;
import Interface.Shoes.IShoes;
import Interface.Trousers.ITrousers;

public class Person {
    public String name;
    public ITrousers trousers;
    public IJacket jacket;
    public IShoes shoes;
    public void on(){
        trousers.puton();
        jacket.puton();
        shoes.puton();
    }
    public void off(){
        trousers.takeoff();
        jacket.takeoff();
        shoes.takeoff();
    }

    public Person(String name, ITrousers trousers, IJacket jacket, IShoes shoes) {
        this.name = name;
        this.trousers = trousers;
        this.jacket = jacket;
        this.shoes = shoes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", trousers=" + trousers +
                ", jacket=" + jacket +
                ", shoes=" + shoes +
                '}';
    }
}
