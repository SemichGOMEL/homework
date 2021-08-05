package lesson2;

public class Num6 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 2; i<101; i++){
            if( i%2 == 0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
