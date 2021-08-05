package lesson3;

import java.util.Random;

public class Num8_1 {
    public static void main(String[] args) {
        String err; int k = 0;
        Random r = new Random();
        int first[] = new int[10];
        int two[] = new int[10];
        double three[] = new double[10];
        for (int i = 0; i < 10; i++) {
            first[i] = r.nextInt(10);
            two[i] = r.nextInt(10);
            System.out.print(first[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(two[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (two[i]>0) {
                three[i] = (double) first[i] / two[i];
                System.out.print(three[i]+" ");
                if (three[i]%1 == 0){
                    k++;
                }
            } else {
                err = "-";
                System.out.print(err+" ");
            }
        }
        System.out.println();
        System.out.println("целых - "+k);
    }
}
