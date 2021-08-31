package Ex2;

public class Planer extends Air{
    public int high;
    public Planer(int capacity, int weight, int passang, double fuelcon, double fuel, String names) {
        super(capacity,
                weight,
                passang,
                fuelcon,
                fuel,
                names);
    }
    /* public void setPassangers(int passangers){
        if(passangers<=3){
            this.passang = passangers;
        }
    } */
    public void setHigh(int high) {
        this.high = high;
    }

    public int getHigh() {
        return high;
    }
    public int time(){
        return (int) ((high*this.passang)/3.23);
    }
}
