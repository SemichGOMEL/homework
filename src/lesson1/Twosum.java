package lesson1;

import java.util.Scanner;

public class Twosum {
        public static void main(String[] args){
        int rez = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Размер массива : ");
        int n = sc.nextInt();
        System.out.println("Сумму которую надо найти в массиве : ");
        int target = sc.nextInt();
        int inp[] = new int[n];
        for( int i = 0; i<n ; i++){
            System.out.println("Элемент массива № "+i+" : ");
            inp[i] = sc.nextInt();
        }
        /*
        for( int i = 1; i<(n-1) ; i++){
            if( target == inp[i]+inp[i-1] ){
                System.out.println("Решение : ");
                System.out.println("["+i+";"+(i-1)+"]");
                rez = 1;
                break;
            }
            if( target == inp[i]+inp[i+1] ){
                System.out.println("Решение : ");
                System.out.println("["+i+";"+(i+1)+"]");
                rez = 1;
                break;
            }
        } */
        for( int i = 1; i<n; i++ ){
            for( int j = 0; j<n; j++ ){
                if( (inp[i] + inp[j]) == target ){
                    System.out.println("["+i+";"+j+"]");
                    rez = 1;
                }
            }
        }
        if (rez == 0){
            System.out.println("В массиве невозможно найти такую сумму последовательных элементов.");
        }
    }
}
