package lesson2;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args){
        int rez = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Число 1");
        int a = sc.nextInt();
        System.out.println("Число 2");
        int b = sc.nextInt();
        for(int i = a; i>0; i--){
            rez = b + rez;
        }
        System.out.println(rez);
    }
}
