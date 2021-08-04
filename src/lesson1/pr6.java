package lesson1;

import java.util.Scanner;

public class pr6 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt(), c;
        c = a;
        if(a > 9){
            c = a % 10;
        }
        if( c == 1 ){
            System.out.println(a+" Программист");
        } else if( (c >= 2) && (c <= 4) ){
            System.out.println(a+" Программиста");
        } else if( ((c >= 5) && (c <= 10)) || (c == 0) ){
            System.out.println(a+" Программистов");
        }
    }
}


