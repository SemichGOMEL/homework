package lesson3;

import java.util.Random;

public class Num3_1 {
    public static void main(String[] args){
        Random r = new Random();
        int k = 0;
        int mass[] = new int[15];
        for( int i = 0; i<15; i++){
            mass[i] = r.nextInt(100);
            System.out.print(mass[i]+" ");
            if(mass[i]%2==0){
                k++;
            }
        }
        System.out.println();
        System.out.print(k);
    }
}
