package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Num9_1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int arr[], j, first = 0, two = 0;
        while (true) {
            j = sc.nextInt();
            if ((j % 2 == 0) && j > 0) {
                break;
            } else {
                System.out.println("Введите другое значение ");
            }
        }
        arr = new int[j];
        for(int i = 0; i<j; i++){
            arr[i] = r.nextInt(16);
            System.out.print(arr[i]+" ");
            if(i<(j/2)){
                first = first+arr[i];
            } else{
                two = two + arr[i];
            }
        }
        System.out.println();
        if(first>two){
            System.out.println("Первая больше");
        } else if(two>first){
            System.out.println("Вторая больше");
        } else{
            System.out.println("Половины равны");
        }
    }
}
