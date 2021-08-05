package lesson3;

import java.util.Random;

public class Num4_1 {
    public static void main(String[] args) {
        Random r = new Random();
        int k = 0;
        int mass[] = new int[20];
        for (int i = 0; i < 20; i++) {
            mass[i] = r.nextInt(21);
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            if((i%2)!=0){
                mass[i] = 0;
            }
            System.out.print(mass[i]+" ");
        }
    }
}