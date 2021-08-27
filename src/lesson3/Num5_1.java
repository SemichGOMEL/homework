package lesson3;

import java.util.Random;

public class Num5_1 {
    public static void main(String[] args) {
        Random r = new Random();
        double first = 0, two = 0;
        int a[] = new int[5];
        int b[] = new int[5];
        for(int i = 0; i<5; i++){
            a[i] = r.nextInt(16);
            first = a[i] + first;
            b[i] = r.nextInt(16);
            two = two + b[i];
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i = 0; i<5; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println(first);
        System.out.println(two);
        if((first/5)>(two/5)){
            System.out.println("Ср арифм первого массива больше");
        } else if((first/5)<(two/5)){
            System.out.println("Ср арифм второго массива больше");
        } else{
            System.out.println("Ср арифм равны");
        }
    }
}
