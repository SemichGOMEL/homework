package Wear;

public class Sport extends Wear{
    String typeofsp, typeofwear;
    int size;

    public Sport(String condition, String gender, Integer price, String colour) {
        super(condition, gender, price, colour);
    }

    public void setSize(int size){
        if (size > 0){
            this.size = size;
        }
    }
    public int GetSize(){
        return this.size;
    }
}
