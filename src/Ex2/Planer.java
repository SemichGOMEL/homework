package Ex2;

public class Planer extends Air{
    public int high;
    public Planer(int capacity, int weight, int passang, double fuelcon, double fuel, String names) {
        super(capacity, weight, passang, fuelcon, fuel, names);
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getHigh() {
        return high;
    }
}
