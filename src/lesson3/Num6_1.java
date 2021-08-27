package lesson3;

import java.util.Random;

public class Num6_1 {
    public static void main(String[] args) {
        Random r = new Random();
        int con = 0;
        int a[] = new int[4];
        for(int i = 0; i<4; i++){
            a[i] = r.nextInt(11);
            System.out.print(a[i]+" ");
            if((i!=0) && (a[i]>a[i-1])){
                con++;
            }
        }
        System.out.println();
        if(con == 4){
            System.out.println("Строго возраст.");
        } else {
            System.out.println("Не возраст.");
        }
    }
}
