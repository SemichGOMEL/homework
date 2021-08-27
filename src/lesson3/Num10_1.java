package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Num10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n, count = 0;
        while(true){
            n = sc.nextInt();
            if(n>3){
                break;
            }else {
                System.out.println("Введите число больше 3");
            }
        } // чтение n
        int mass[] = new int[n];
        System.out.println("Первый массив :");
        for(int i = 0; i<n; i++){
            mass[i] = r.nextInt(n+1);
            System.out.print(mass[i]+" ");
            if ((mass[i]%2==0) && (mass[i]>0)){
                count++;
            }
        } // заполнение массива, кол-во четных, вывод
        System.out.println();
        System.out.print("Количество четных чисел в первом массиве - "+count);
        System.out.println();
        if (count == 0){
            System.out.print("Нет четных чисел в массиве");
        } else {
            int mass2[] = new int[count];
            count = 0;
            System.out.println("Второй массив :");
            for (int i = 0; i < n; i++) {
                if ((mass[i]%2==0) && (mass[i]>0)) {
                    mass2[count] = mass[i];
                    System.out.print(mass2[count]+" ");
                    count++;
                }
            }
        } // заполнение второго массива
        //
        //
        //
        // доп задачи к первому массиву
        int kr=1;
        for(int i = 0; i<n; i++){
        if((mass[i]%3==0) && (mass[i])!=0){
            kr = kr*mass[i];
        } // кратные трём
        }
        System.out.println();
        if (kr > 1){
            System.out.println("Произведение элементов кратных трём - "+kr);
        } else {
            System.out.println("Нет элементов кратных трём");
        }
        //
        //
        int sr = 0, l = 0;
        for(int i = 0; i<n; i++){
            if((i%2!=0)&&(i>0)){
                sr = sr+mass[i];
                l++;
            }
        }
        System.out.println("среднее арифметическое элементов с нечетными номерами - "+((double)sr/l));
        //
        //
        System.out.println("Введите число С");
        int C = sc.nextInt();
        sr = 0;
        l = 0;
        for(int i = 0; i<n; i ++){
            if (mass[i] > C){
                sr = sr+mass[i];
                l++;
            }
        }
        System.out.println("среднее арифметическое элементов превосходящих число "+C+" = "+((double)sr/l));
        //
        //
        int min;
        min = mass[1];
        for(int i = 1; i<=n-1; i = i+2){
            if(mass[i]<min){
                min = mass[i];
            }
        }
        System.out.println("наименьший нечетный элемент - "+min);
    }
}
