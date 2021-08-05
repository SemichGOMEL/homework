package lesson3;

import java.util.Random;

public class Num7_1 {
    public static void main(String[] args) {
        Random r = new Random();
        int a[] = new int[12];
        int max = 0, k = 0;
        for(int i = 0; i<12; i++){
            a[i] = r.nextInt(16);
            if(i == 0){
                max = a[i];
            }
            if(a[i]>max){
                max = a[i];
                k = i;
            }
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Макс элемент = "+max+"; Индекс = "+k);
    }
}
