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
        switch (c){
            case 0:
                System.out.println(a+" программистов");
                break;
            case 1:
                System.out.println(a+" программист");
                break;
            case 2:
                System.out.println(a+" программиста");
                break;
            case 3:
                System.out.println(a+" программиста");
                break;
            case 4:
                System.out.println(a+" программиста");
                break;
            case 5:
                System.out.println(a+" программистов");
                break;
            case 6:
                System.out.println(a+" программистов");
                break;
            case 7:
                System.out.println(a+" программистов");
                break;
            case 8:
                System.out.println(a+" программистов");
                break;
            case 9:
                System.out.println(a+" программистов");
                break;
            case 10:
                System.out.println(a+" программистов");
                break;
        }
    }
}
