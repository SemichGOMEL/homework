package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String h;
        Scanner jv = new Scanner(System.in);
        int a = jv.nextInt();
        String j = Integer.toString(a);
        if(a > 0){
            switch (j.length()){
                case 1:
                    h = "Однозначное";
                    break;
                case 2:
                    h = "Двухзначное";
                    break;
                case 3:
                    h = "Трехзначное";
                    break;
                default:
                    h = "Более трехзначного";
                    break;
            }
            System.out.println("Положительное, количество цифр - "+j.length()+" ,"+h);
        }
    }
}
