package Ex2;

public class Air {
    public int capacity, weight, passang;
    public double range, fuelcon, fuel;
    public String info;
    public String names;

    public Air(int capacity, int weight, int passang, double fuelcon, double fuel, String names) {
        this.capacity = capacity;
        this.weight = weight;
        this.passang = passang;
        this.fuelcon = fuelcon;
        this.fuel = fuel;
        this.names = names;
    }

    public int allweight(){
        return this.capacity + this.weight;
    }
    public void calcrange(){
        this.range = fuelcon / fuel;
    }
    public void landing(){
        this.info = "транспорт посажен.";
    }
    public void takeof(){
        this.info = "транспорт в воздухе.";
    }
    public void info(String name){
        System.out.println(name+" "+this.info);
    }

    @Override
    public String toString() {
        return "Air{" +
                "capacity=" + capacity +
                ", weight=" + weight +
                ", passang=" + passang +
                ", range=" + range +
                ", fuelcon=" + fuelcon +
                ", fuel=" + fuel +
                ", info='" + info + '\'' +
                ", names='" + names + '\'' +
                '}';
    }
}
