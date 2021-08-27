package Wear;

public class Wear {
    String condition, gender, colour;
    int price;

    public Wear(String condition, String gender, Integer price, String colour) {
        this.condition = condition;
        this.gender = gender;
        this.price = price;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Wear{" +
                "condition='" + condition + '\'' +
                ", gender='" + gender + '\'' +
                ", price='" + price + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
    public void Price(){
        this.price = price*10000;
    }
}
