package lesson1;

import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt(), b = inp.nextInt();
        if( a > b ){
            System.out.println("наибольшее число - "+a);
        } else if( a < b ){
            System.out.println("наибольшее число - "+b);
        } else{
            System.out.println("числа равны");
        }
    }
}
