package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Num1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt(), chgl = 0, pr1 = 1, pr2 = 1;
        int arr[][] = new int[n][n];
        for(int i = 0; i<n; i++){
            for (int j = 0; j<n; j ++){
                arr[i][j] = r.nextInt(51);
                System.out.print(arr[i][j]+" ");
                if(i==j){
                    pr1 = pr1 * arr[i][j];
                }
                if((i == j) && (arr[i][j]%2==0) && (arr[i][j]!=0)){
                    chgl++;
                }
            }
            System.out.println();
        }
        System.out.println("Кол-во четных на гл диагонали = "+chgl);
        System.out.println("Нечетные элементы под гл диагональю(вкл)");
        for(int i = 0; i<n; i++){
            for (int j = 0; j<n; j ++){
                if((j<=i) && (arr[i][j]%2!=0)){
                    System.out.print(arr[i][j]+" ");
                }
                }
            }
        for(int i = 0; i<n; i++){
            for (int j = 0; j<n; j ++){
                if(i+j==n-1){
                    pr2 = pr2 * arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Произведение основной диагонали = "+pr1+"; Произведение побочной диагонали = "+pr2+".");
        if(pr1>pr2){
            System.out.println("произведение основной больше");
        } else if(pr2>pr1){
            System.out.println("произведение побочной больше");
        } else{
            System.out.println("равны произвдения диагоналей");
        }
    }
}
