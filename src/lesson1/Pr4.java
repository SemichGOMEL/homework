package lesson1;

import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt(), b = inp.nextInt(), c = inp.nextInt(), pos = 0, neg = 0;
        if(a > 0){
            pos++;
        } else if(a < 0){
            neg++;
        }
        if(b > 0){
            pos++;
        } else if(b < 0){
            neg++;
        }
        if(c > 0){
            pos++;
        } else if(c < 0){
            neg++;
        }
        System.out.println("положительных - "+pos+", отрицательных - "+neg);
    }
}
