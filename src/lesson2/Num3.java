package lesson2;

public class Num3 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1; i<257; i = i*2){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
