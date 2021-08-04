package lesson1;

import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        if(a>0){
            a++;
        } else if(a < 0){
            a = a-2;
        } else{
            a = 10;
        }
        System.out.println(a);
    }
}
