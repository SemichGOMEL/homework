package lesson2;

public class Num2 {
    public static void main(String[] args){
        int amf = 1;
        for (int i=3; i<25; i = i+3){
            amf = amf*2;
            System.out.println("Время: "+i+", клеток - "+amf);
        }
    }
}
